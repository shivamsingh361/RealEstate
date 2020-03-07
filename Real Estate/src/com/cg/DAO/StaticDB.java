package com.cg.DAO;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import com.cg.DTO.*;
public class StaticDB {
	public static Map<String,User> userMap = new HashMap<String,User>();
	public static Map<String,Property> propertyMap = new HashMap<String,Property>();
	
	static{
		userMap.put("Ashishverma001@xyz.com", new User("BUYER", "Ashishverma001@xyz.com","password000"));
		userMap.put("Shivamsingh001@xyz.com", new User("BUYER", "Shivamsingh001@xyz.com","password001"));
		userMap.put("Nishantsharma01@xyz.com", new User("BUYER", "Nishantsharma01@xyz.com","password002"));
		
		userMap.put("Sumitgupta@xyz.com", new User("SELLER", "Sumitgupta@xyz.com","password043"));
		userMap.put("Yashbhatia@xyz.com", new User("SELLER", "Yashbhatia@xyz.com","password034"));
		
		propertyMap.put("001",new Property(new Address("1001", "Pune", "Maharastra","Talwade"),
				"001", "5800000", "Near Hanuman Mandir", 
				"Double Floored with 2 rooms at each,with attached bathroom ", "House"));
		
		propertyMap.put("002",new Property(new Address("2001", "Pune", "Maharastra","Nigdi"),
				"002", "15800000", "Near Central Mall", 
				"Double Floored with 4 rooms at each,with attached bathroom and balcony, Open Kitchen", "Villa"));
		
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
}
