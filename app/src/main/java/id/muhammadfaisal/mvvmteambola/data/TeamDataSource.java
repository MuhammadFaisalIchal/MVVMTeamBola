package id.muhammadfaisal.mvvmteambola.data;

import id.muhammadfaisal.mvvmteambola.model.Team;

/**
 * Kelas ini berfungsi sebagai blue print kira - kira fungsi - fungsi
 * atau method apa saja yang akan kita pakai dan juga seperti apa untuk callback nya,
 * apa yang di inputkan dan apa yang akan dihasilkan
 * */
public interface TeamDataSource {

    void getListTeams(GetTeamsCallback callback);

    interface GetTeamsCallback {
        void onTeamLoaded(Team data);
        void onDataNotAvailable(String errorMessage);
    }
}
