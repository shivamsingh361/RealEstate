package com.cg.DAO;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import com.cg.DTO.*;
import com.cg.exception.UserException;
//import com.cg.DAO.*;


public class DaoBuyerImpl implements DaoBuyer {

	public List<Property> searchProperty(Filter filter) {
		
		Map<String, Property> temp = StaticDB.getPropertyMap();
		Set<Entry<String, Property>> prop = temp.entrySet();
		List<Property> propList = new ArrayList<Property>();
		if(filter == null) {
			for(Entry<String, Property> tem : prop){
				Property property = (Property)tem.getValue();
				propList.add(property);
			}
			return propList;
		}
		else
			for(Entry<String, Property> tem : prop){
				Property property = (Property)tem.getValue();
				if(property.getCity().equals(filter.getLocation()) && (filter.getType().equals(property.getType())))
					if((Integer.parseInt(filter.getMinPrice()) < Integer.parseInt(property.getPropPrice())) && (Integer.parseInt(filter.getMaxPrice()) > Integer.parseInt(property.getPropPrice())) )
						propList.add(property);
			}
			return propList;
	}

	public User updateUser(String id, User user) {
		Map<String, User> temp = StaticDB.getUserMap();
		temp.put(id, user);
		StaticDB.setUserMap(temp);
		return user;
	}

	public boolean updatePassword(String id, String newPassword) {
		Map<String, User> temp = StaticDB.getUserMap();
		try {
			//System.out.println(">"+id+"<");
			temp.get(id).setPassword(newPassword);
			StaticDB.setUserMap(temp);
		}catch(Exception e) {
			throw new UserException("Some-thing went wrong while updating password.",e);
		}
		return true;
	}

	@Override
	public Property getPropertyById(String propId) {
			return StaticDB.getPropertyMap().get(propId);
	}

}
