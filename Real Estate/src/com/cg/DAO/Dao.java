package com.cg.DAO;

import java.util.List;
import com.cg.DTO.*;

public interface Dao {
	abstract String checkIfEmailPhoneExist(String id);	//return msg weather given unique id exist in db
	abstract void addNewUser(User user);		//add new user on registration 
	abstract User checkUser(String id, String password);	// if credentials true return user obj else return null
	abstract List<Property> SearchProperty(Filter filter);	// returns list of property object
	abstract User UpdateUser(String id, User user);
	List<Property> addProperty(Property prop, User user);//on updation of user profile returns updated User object.
}
