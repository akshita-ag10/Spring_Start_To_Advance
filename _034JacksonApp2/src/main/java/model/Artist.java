package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Artist {
	
	private int aId;
	private String aName;
	private String aCity;
	
	
	public Artist() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Artist(int aId, String aName, String aCity) {
		super();
		this.aId = aId;
		this.aName = aName;
		this.aCity = aCity;
	}

	@Override
	public String toString() {
		return "Artist [aId=" + aId + ", aName=" + aName + ", aCity=" + aCity + "]";
	}

	public int getaId() {
		return aId;
	}

	public void setaId(int aId) {
		this.aId = aId;
	}

	public String getaName() {
		return aName;
	}

	public void setaName(String aName) {
		this.aName = aName;
	}

	public String getaCity() {
		return aCity;
	}

	public void setaCity(String aCity) {
		this.aCity = aCity;
	}
	
	
	

}
