package br.sc.vitor.modelo;

public class Cidade {

	private String idIBGE;
	private String uf;
	private String name;
	private String capital;
	private String lon;
	private String lat;

	public Cidade() {
	}

	public Cidade(String idIBGE) {
		super();
		this.idIBGE = idIBGE;
	}

	public Cidade(String uf, String name, String capital, String lon, String lat) {
		super();
		this.uf = uf;
		this.name = name;
		this.capital = capital;
		this.lon = lon;
		this.lat = lat;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public String getLon() {
		return lon;
	}

	public void setLon(String lon) {
		this.lon = lon;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getIdIBGE() {
		return idIBGE;
	}

	public void setIdIBGE(String idIBGE) {
		this.idIBGE = idIBGE;
	}

}
