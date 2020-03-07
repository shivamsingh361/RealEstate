package com.cg.DTO;

public class Address {

	private String houseNo;
	private String city;
	private String state;
	private String locality;
	public Address(String houseNo, String city, String state, String locality) {
		super();
		this.houseNo = houseNo;
		this.city = city;
		this.state = state;
		this.locality = locality;
	}
	public Address(String city, String state) {
		super();
		this.city = city;
		this.state = state;

	}
	@Override
	public String toString() {
		return "Address houseNo=" + houseNo + ", city=" + city + ", state=" + state + ", locality=" + locality + "]";
	}
	
	public String toStringCustom() {
		return   houseNo + " "+ city + " " + state + " " + locality;
	}
	public String getCity(){
		return this.city;
	}
}
