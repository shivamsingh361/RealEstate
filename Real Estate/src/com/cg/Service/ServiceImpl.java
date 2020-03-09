package com.cg.Service;

import java.util.ArrayList;
import java.util.List;

import com.cg.DAO.Dao;
import com.cg.DAO.DaoBuyer;
import com.cg.DAO.DaoBuyerImpl;
import com.cg.DAO.DaoImpl;
import com.cg.DAO.DaoSeller;
import com.cg.DAO.DaoSellerImpl;
import com.cg.DTO.Filter;
import com.cg.DTO.Property;
import com.cg.DTO.User;
import com.cg.DTO.UserType;

public class ServiceImpl implements Service{

	Dao dao = new DaoImpl();
	DaoSeller sellerDao = new DaoSellerImpl();
	DaoBuyer buyerDao = new DaoBuyerImpl();
	User user;
	@Override
	public int verifyOTP(String id) {
		if(dao.checkIfUserExist(id)) {
			return (int) (Math.random()*10000);
		}
		else
			return 0;
	}

	@Override
	public String updatePassword(String oldPass, String newPass) {
		if(user.getPassword().equals(oldPass)) {
			if(buyerDao.updatePassword(user.getLoginId(), newPass))
				return "Password Updated";
			else
				return "Server Not Found";
		}
		else
			return "Invalid Old Password!";
	}

	@Override
	public List<Property> userHome() {
		List<Property> properties = new ArrayList<Property>();
		if(user.type.equals(UserType.BUYER)) {
			for(Property prop: buyerDao.searchProperty(null)) {
				properties.add(prop);
			}
		}
		else {
			for(Property prop: buyerDao.searchProperty(null)) {
				if(prop.getOwner().equals(user))
					properties.add(prop);
			}
		}
		return properties;
	}

	@Override
	public boolean login(String id, String pass) {
		User temp = dao.login(id, pass);
		if(temp == null)
			return false;
		else{
			user = temp;
			return true;
		}
	}

	@Override
	public String Register(User user) {
		if(dao.checkIfUserExist(user.getLoginId())) {
			dao.register(user);
			return "New User Created!";
		}
		else
			return "User Id Already exists. Please Login!";
	}

	@Override
	public List<Property> Search(Filter filter) {
		return buyerDao.searchProperty(filter);
	}

	@Override
	public User updateUserProfile(String Name, String contact) {
		if(Name!= null)
			user.setName(Name);
		if(contact!=null)
			user.setPhoneNo(contact);
		return buyerDao.updateUser(user.getLoginId(), user);
	}

	@Override
	public String logout() {
		user = null;
		return "OK";
	}

	@Override
	public List<Property> addProperty(Property prop) {
		prop.setOwner(user);
		return sellerDao.addProperty(prop);
	}

	@Override
	public List<Property> deleteProperty(String propId) {
		return sellerDao.deleteProperty(propId);
	}



}
