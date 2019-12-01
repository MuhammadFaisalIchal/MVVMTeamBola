package id.muhammadfaisal.mvvmteambola.data.remote;

import id.muhammadfaisal.mvvmteambola.model.Team;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Kelas ini berfungsi sebagai Api interface untuk mengkonfigurasi
 * bagian endpoint mana yang akan kita tuju,
 * tipe request dan serta parameter yang akan kita kirim ke API,
 * untuk penulisan tipe request (POST, GET, PUT) dan parameter
 * Retrofit menggunakan sistem ​anotasi​.*/
public interface ApiInterface {

    /**
     * Menjadi https://www.thesportsdb.com/api/v1/json/1/search_all_teams.php?l={Query}
     * Things that come after the ? are usually queries.
     * */
    @GET("/api/v1/json/1/search_all_teams.php")
    Call<Team> getAllTeams(
            @Query("l") String search);
}
