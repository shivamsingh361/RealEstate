package com.cg.DAO;


import com.cg.DTO.*;

public interface Dao {
	boolean checkIfUserExist(String id);	//return msg weather given unique id exist in db
	void register(User user);		//add new user on registration 
	User login(String id, String password);	// if credentials true return user obj else return null
}
