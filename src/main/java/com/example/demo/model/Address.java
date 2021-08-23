package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "addresses")
public class Address {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;	
    
    @Column(name = "zip")
    @NotEmpty
    private int zip;
    
    @Column(name = "publicplace")
    @NotEmpty
    private String publicplace;
	
    @Column(name = "district")
    @NotEmpty
    private String district;
    
    @Column(name = "state")
    @NotEmpty
    private String state;
	
    //Default Constructor
    public Address() {}
    
	public Address(int zip, String publicplace, String district, String state) {
		super();
		this.zip = zip;
		this.publicplace = publicplace;
		this.district = district;
		this.state = state;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public String getPublicplace() {
		return publicplace;
	}

	public void getPublicplace(String publicplace) {
		this.publicplace = publicplace;
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
