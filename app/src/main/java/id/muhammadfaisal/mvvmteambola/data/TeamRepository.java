package id.muhammadfaisal.mvvmteambola.data;

import id.muhammadfaisal.mvvmteambola.data.local.TeamLocalDataSource;
import id.muhammadfaisal.mvvmteambola.data.remote.TeamRemoteDataSource;

/**
 * Kelas ini berfungsi untuk mempresentasikan fungsi
 * dan method - method dari kelas remote dan kelas local. */
public class TeamRepository implements TeamDataSource {

    // TODO* LAST
    //  Kemudian kita akan membuat fungsi getTeamsFromRemote

    private TeamRemoteDataSource teamRemoteDataSource;
    private TeamLocalDataSource teamLocalDataSource;

    @Override
    public void getListTeams(GetTeamsCallback callback) {

    }
}
