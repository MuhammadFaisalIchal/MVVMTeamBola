package id.muhammadfaisal.mvvmteambola.data.remote;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    private static Retrofit retrofit = null;

    /**
     *  ​Instance dari class Retrofit dan mengkonfigurasi
     *  beberapa nilai seperti base url yang akan digunakan juga pada bagian converter nya,
     *  disini kita menggunakan gson converter untuk men deserialisasi data JSON nya */
    public static Retrofit getClient(){
        retrofit = new Retrofit.Builder()
                .baseUrl("https://www.thesportsdb.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit;
    }
}
