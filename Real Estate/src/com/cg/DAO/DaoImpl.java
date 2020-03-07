package com.cg.DAO;

import java.util.List;

import com.cg.DTO.Filter;
import com.cg.DTO.Property;
import com.cg.DTO.User;

public class DaoImpl implements Dao {

	@Override
	public boolean checkIfUserExist(String id) {
		if(StaticDB.userMap.containsKey(id))
			return true;
		else
			return false;
	}

	@Override
	public void register(User user) {
		StaticDB.userMap.put(user.getLoginId(), user);
	}

	@Override
	public User login(String id, String password) {
		if(StaticDB.userMap.get(id).getPassword().equals(password))
			return StaticDB.userMap.get(id);
		else
			return null;
	}
	
}
