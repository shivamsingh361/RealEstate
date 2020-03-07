package com.cg.DTO;

public class Property {

	private Address propAddress;
	private String propId;
	private String propPrice;
	private String landmark;
	private String propDescription;
	private String type;
	private User owner;
	public Property(Address propAddress, String propId, String propPrice, String landmark, String propDescription,
			String type) {
		super();
		this.propAddress = propAddress;
		this.propId = propId;
		this.propPrice = propPrice;
		this.landmark = landmark;
		this.propDescription = propDescription;
		this.type = type;
	}
	@Override
	public String toString() {
		return "Property [propAddress=" + propAddress + ", propId=" + propId + ", propPrice=" + propPrice
				+ ", landmark=" + landmark + ", propDescription=" + propDescription + ", type=" + type + "]";
	}
	
	
}
