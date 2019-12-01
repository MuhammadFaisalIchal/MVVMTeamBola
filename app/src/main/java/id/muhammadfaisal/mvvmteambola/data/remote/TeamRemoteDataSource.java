package id.muhammadfaisal.mvvmteambola.data.remote;

import id.muhammadfaisal.mvvmteambola.data.TeamDataSource;
import id.muhammadfaisal.mvvmteambola.model.Team;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Kelas ini akan meng implements ke dalam kelas interface
 * TeamDataSource yang sebelumnya sudah kita buat,
 * agar fungsi dan method - method dari kelas interface
 * akan kita berikan body atau perintah... */
public class TeamRemoteDataSource implements TeamDataSource {

    private ApiInterface apiInterface = ApiClient.getClient().create(ApiInterface.class);

    /**
     * Perintah untuk mengambil data dari API menggunakan Retrofit*/
    @Override
    public void getListTeams(final GetTeamsCallback callback) {

        Call<Team> call = apiInterface.getAllTeams("English Premier League");
        call.enqueue(new Callback<Team>() {
            @Override
            public void onResponse(Call<Team> call, Response<Team> response) {
                callback.onTeamLoaded(response.body());
            }

            @Override
            public void onFailure(Call<Team> call, Throwable t) {
                callback.onDataNotAvailable(t.toString());
            }
        });
    }
}
