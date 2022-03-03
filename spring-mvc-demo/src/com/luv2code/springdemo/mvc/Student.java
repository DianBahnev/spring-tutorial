package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {
	
	private String firstName;
	private String lastName;

	private String country;
	private String favoriteLanguage;
	private String[] operatingSystems;
	
	private LinkedHashMap<String, String> countryOptions;
	private LinkedHashMap<String, String> favoriteLanguageOptions;
	
	public Student() {
			//populate country options
			countryOptions = new LinkedHashMap<>();
			
			countryOptions.put("BR", "Brazil");
			countryOptions.put("GR", "Germany");
			countryOptions.put("IT", "Italy");
			countryOptions.put("IN", "India");
			
			favoriteLanguageOptions = new LinkedHashMap<>();
	        // parameter order: value, display label
	        //
	        favoriteLanguageOptions.put("Java", "Java");
	        favoriteLanguageOptions.put("C#", "C#");
	        favoriteLanguageOptions.put("PHP", "PHP");
	        favoriteLanguageOptions.put("Ruby", "Ruby");    
		}
	
	
	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}
	
	public LinkedHashMap<String, String> getFavoriteLanguageOptions() {
        return favoriteLanguageOptions;
    }


	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}


	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}


	public String[] getOperatingSystems() {
		System.out.println("get operatingSystems");
		System.out.println(operatingSystems);
		
		return operatingSystems;
	}


	public void setOperatingSystems(String[] operatingSystems) {
		System.out.println("set operatingSystems");
		System.out.println(operatingSystems);
		
		this.operatingSystems = operatingSystems;
		
		System.out.println(this.operatingSystems );
	}
	
	 

}
