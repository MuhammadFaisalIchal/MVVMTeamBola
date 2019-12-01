package id.muhammadfaisal.mvvmteambola.data.local;

import android.content.Context;

import java.util.List;

import id.muhammadfaisal.mvvmteambola.data.TeamDataSource;
import id.muhammadfaisal.mvvmteambola.model.Team;
import id.muhammadfaisal.mvvmteambola.model.TeamDetail;

/**
 * Untuk pengambilan data local*/
public class TeamLocalDataSource implements TeamDataSource {

    private Context context;
    private TeamDao teamDao;

    /**
     * Pada bagian konstruktor kelas nya kita akan memanggil fungsi instance
     * dari kelas TeamDataBase nya
     * */
    public TeamLocalDataSource(Context context, TeamDao teamDao) {
        this.context = context;
        this.teamDao = teamDao;
    }

    /**
     * Pada bagian method getListTeams kita menambahkan fungsi
     * untuk mengambil data dari database local (SQLite),
     * tapi sebelum nya kita akan melakukan pengecekan terlebih dahulu,
     * apakah data dari database local(SQLite) tersedia*/
    @Override
    public void getListTeams(final GetTeamsCallback callback) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                final List<TeamDetail> team = teamDao.getTeams();
                if (team.isEmpty()){
                    callback.onDataNotAvailable("Data di DatabaseSQLite kosong");
                } else {
                    Team teams = new Team(team);
                    callback.onTeamLoaded(teams);
                }
            }
        };
        new Thread(runnable).start();
    }

    /**
     * Pada kelas ini juga kita akan buatkan fungsi untuk menyimpan data
     * hasil dari pengambilan di internet ke dalam database local (SQLite)
     * */
    public void saveDataTeam(final List<TeamDetail> teamDetail){
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                teamDao.insertTeam(teamDetail);
            }
        };
        new Thread(runnable).start();
    }
}