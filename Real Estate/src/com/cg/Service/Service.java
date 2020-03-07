package com.cg.Service;

import java.util.List;
import com.cg.DTO.*;

interface Service {
	abstract int verifyOTP(String id);			// Return 6-digit OTP and sends same to registered userid also veryfy the user id if exist.
	abstract String updatePassword(String id, String password); //update password of user.
	//
	abstract String userHome();
	abstract String Home();
	//
	abstract String login(String id, String pass);
	abstract String Register(User user);
	//
	abstract List<String> Search(Filter filter);
	abstract String updateUserProfile(String Name);
	//
	abstract String logout();
}