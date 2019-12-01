package id.muhammadfaisal.mvvmteambola.data.local;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import id.muhammadfaisal.mvvmteambola.model.TeamDetail;

/**
 * Pada kelas ini kita akan menentukan nama database kita dan version database nya,
 * untuk nama database local kita akan menggunakan nama “​Team.db”
 * kemudian untuk verson nya karena masih baru kita akan menggunakan version ​“1”
 * */
@Database(entities = {TeamDetail.class}, version = 1)
public abstract class TeamDataBase extends RoomDatabase {

    private static  TeamDataBase INSTANCE;

    public abstract TeamDao teamDao();

    private static final Object sLock = new Object();

    public static TeamDataBase getInstance(Context context){
        synchronized (sLock){
            if (INSTANCE == null){
                INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                        TeamDataBase.class,
                        "Team.db")
                        .build();
            }
        }
        return INSTANCE;
    }
}
