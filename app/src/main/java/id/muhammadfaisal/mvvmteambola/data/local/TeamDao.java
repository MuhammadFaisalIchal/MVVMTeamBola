package id.muhammadfaisal.mvvmteambola.data.local;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

import id.muhammadfaisal.mvvmteambola.model.TeamDetail;

/**
 * Data Array Object (DAO)
 * Kelas ini berfungsi untuk menyimpan perintah - perintah Query
 * */
@Dao
public interface TeamDao {

    @Query("SELECT * FROM team")
    List<TeamDetail> getTeams();

    @Insert
    void insertTeam (List<TeamDetail> team);
}
