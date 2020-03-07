package com.cg.DAO;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.cg.DTO.Property;

public class DaoSellerImpl implements DaoSeller {

	@Override
	public List<Property> addProperty(Property property) {
		Map<String, Property> temp = StaticDB.getPropertyMap();
		temp.put(property.getPropId(), property);
		StaticDB.setPropertyMap(temp);
		Set<Entry<String, Property>> prop = temp.entrySet();
		List<Property> propList = new ArrayList<Property>();
		for(Entry<?, ?> tem : prop){
			propList.add((Property)tem.getValue());
		}
		return propList;
	}

	@Override
	public List<Property> deleteProperty(String propId) {
		Map<String, Property> temp = StaticDB.getPropertyMap();
		temp.remove(propId);
		StaticDB.setPropertyMap(temp);
		Set<Entry<String, Property>> prop = temp.entrySet();
		List<Property> propList = new ArrayList<Property>();
		for(Entry<?, ?> tem : prop){
			propList.add((Property)tem.getValue());
		}
		return propList;
	}

}
