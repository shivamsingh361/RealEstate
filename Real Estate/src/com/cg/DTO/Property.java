package com.cg.DTO;

public class Property {

	private Address propAddress;
	private  String propId;
	private static int propCounter = 0;
	private String propPrice;
	private String landmark;
	private String propDescription;
	private PropertyType type;
	private User owner;

	public Property(Address propAddress, String propPrice, String landmark, String propDescription,
			PropertyType type) {
		super();
		this.propAddress = propAddress;
		this.propId = Integer.toString(propCounter++);
		this.propPrice = propPrice;
		this.landmark = landmark;
		this.propDescription = propDescription;
		this.type = type;
	}
	public User getOwner() {
		return owner;
	}
	public void setOwner(User owner) {
		this.owner = owner;
	}
	@Override
	public String toString() {
		return "Property [propAddress=" + propAddress + ", propId=" + propId + ", propPrice=" + propPrice
				+ ", landmark=" + landmark + ", propDescription=" + propDescription + ", type=" + type + "]+\n";
	}
	public String getPropId() {
		return propId;
	}
	public void setPropId(String propId) {
		this.propId = propId;
	}
	public String getPropPrice() {
		return propPrice;
	}
	public String getLandmark() {
		return landmark;
	}
	public PropertyType getType() {
		return type;
	}
	public String getCity(){
		return propAddress.getCity();
	}
	
}
