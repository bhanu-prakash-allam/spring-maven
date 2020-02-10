package com.cts.training.spring.web.model;

import java.util.LinkedHashMap;

public class Student {
	
	private String uname;
	private String email;
	private String country;
	private String favoriteLanguage;
	private String[] operatingSystems;
	
	public Student() {
		this.countries = new LinkedHashMap<String, String>();
		this.countries.put("FR", "FRANCE");
		this.countries.put("IN", "INDIA");
		this.countries.put("GR", "GERMANY");
		this.countries.put("US", "USA");
	}
	private LinkedHashMap<String, String> countries;
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getEmail() {
		
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
		if(this.email == null)
			this.email = "dummy@mail.com";
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public LinkedHashMap<String, String> getCountries() {
		return countries; 
	}
	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}
	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}
	public String[] getOperatingSystems() {
		return operatingSystems;
	}
	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}

}
