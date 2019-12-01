package id.muhammadfaisal.mvvmteambola.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Kelas yang berfungsi sebagai kelas DAO (Data Array Object)
 * untuk mengambil respon data dari API */
public class Team{

	/**
	 * Karena pada data respon json data teams berupa array
	 * maka kita membuat variabel teams berupa​ list yang berisi Objek TeamDetail,
	 * untuk anotasi SerializedName ini merupakan fungsi dari Gson
	 * untuk mewakili nama dari json nya */
	@SerializedName("teams")
	private List<TeamDetail> teams;

	public Team(List<TeamDetail> teams) {
		this.teams = teams;
	}

	public void setTeams(List<TeamDetail> teams){
		this.teams = teams;
	}

	public List<TeamDetail> getTeams(){
		return teams;
	}
}