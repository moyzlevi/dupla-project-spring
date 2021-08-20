package com.example.demo.model;

public class Address {
	private int zip;
	private String publicPlace;
	private String district;
	private String state;
	
	public Address(int zip, String publicPlace, String district, String state) {
		super();
		this.zip = zip;
		this.publicPlace = publicPlace;
		this.district = district;
		this.state = state;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public String getPublicPlace() {
		return publicPlace;
	}

	public void setPublicPlace(String publicPlace) {
		this.publicPlace = publicPlace;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	
}
