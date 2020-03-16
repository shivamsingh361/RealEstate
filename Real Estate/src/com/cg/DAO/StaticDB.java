package com.cg.DAO;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cg.DTO.*;
public class StaticDB {
	private static Map<String,User> userMap = new HashMap<String,User>();
	private static Map<String,Property> propertyMap = new HashMap<String,Property>();
	
	private static Map<User, List<Property>> interestList = new HashMap<User, List<Property>>();

		static {
		userMap.put("Ashishverma001@xyz.com", new User(UserType.BUYER, "Ashishverma001@xyz.com","password000","Ashish","9897979797",new Address("Mathura", "Uttar Pradesh")));
		userMap.put("Shivamsingh001@xyz.com", new User(UserType.BUYER, "Shivamsingh001@xyz.com","password001","Shivam","9658745965",new Address("Noida", "Uttar Pradesh")));
		userMap.put("Nishantsharma01@xyz.com", new User(UserType.BUYER, "Nishantsharma01@xyz.com","password002","Nishant","9856741236",new Address("G.Noida", "Uttar Pradesh")));
		
		userMap.put("Sumitgupta@xyz.com", new User(UserType.SELLER, "Sumitgupta@xyz.com","password003","Sumit","9897768985",new Address("G.Noida", "Uttar Pradesh")));
		userMap.put("Yashbhatia@xyz.com", new User(UserType.SELLER, "Yashbhatia@xyz.com","password004","Yash","9897764123",new Address("Noida", "Uttar Pradesh")));
	
		propertyMap.put("1",new Property(new Address("1001", "Pune", "Maharastra","Talwade"),
				 "5800000", "Near Hanuman Mandir", 
				"Double Floored with 2 rooms at each,with attached bathroom ", PropertyType.HOUSE));
		
		propertyMap.put("2",new Property(new Address("2001", "Pune", "Maharastra","Nigdi"),
				 "15800000", "Near Central Mall", 
				"Double Floored with 4 rooms at each,with attached bathroom and balcony, Open Kitchen", PropertyType.VILLA));
		}	
	public static Map<String, User> getUserMap() {
		return userMap;
	}
	public static void setUserMap(Map<String, User> userMap) {
		StaticDB.userMap = userMap;
	}
	public static Map<String, Property> getPropertyMap() {
		return propertyMap;
	}
	public static void setPropertyMap(Map<String, Property> propertyMap) {
		StaticDB.propertyMap = propertyMap;
	}
	
	public static Map<User, List<Property>> getInterestList() {
		return interestList;
	}
	public static void setInterestList(Map<User, List<Property>> interestList) {
		StaticDB.interestList = interestList;
	}
}
