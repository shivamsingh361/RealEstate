package com.cg.DAO;


import com.cg.DTO.User;
//import com.cg.DAO.*;
public class DaoImpl implements Dao {

	public boolean checkIfUserExist(String id) {
		if(StaticDB.getUserMap().containsKey(id))
			return true;
		else
			return false;
	}

	
	public void register(User user) {
		StaticDB.getUserMap().put(user.getLoginId(), user);
	}

	
	public User login(String id, String password) {
		if(StaticDB.getUserMap().get(id).getPassword().equals(password))
			return StaticDB.getUserMap().get(id);
		else
			return null;
	}
}
