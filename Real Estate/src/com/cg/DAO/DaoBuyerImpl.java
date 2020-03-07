package com.cg.DAO;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import com.cg.DTO.Filter;
import com.cg.DTO.Property;
import com.cg.DTO.User;

public class DaoBuyerImpl implements DaoBuyer {

	@Override
	public List<Property> searchProperty(Filter filter) {
		Map<String, Property> temp = StaticDB.getPropertyMap();
		Set<Entry<String, Property>> prop = temp.entrySet();
		
		List<Property> propList = new ArrayList<Property>();
		for(Entry tem : prop){
			Property property = (Property)tem.getValue();
			if(property.getCity().equals(filter.getLocation()))
				propList.add(property);
		}
		return propList;
	}

	@Override
	public User updateUser(String id, User user) {
		return null;
	}

	@Override
	public boolean updatePassword(String id, String newPassword) {
		return false;
	}

}
