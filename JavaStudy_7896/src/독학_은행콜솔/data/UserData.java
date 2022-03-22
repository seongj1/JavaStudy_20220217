package 독학_은행콜솔.data;

import java.util.ArrayList;

import 독학_은행콜솔.model.User;

public class UserData {
	private static UserData instance;
	private ArrayList<User> userList;
	
	private UserData() {
		userList = new ArrayList<User>();
	}
	
	public static UserData getInstance() {
		if(instance == null) {
			instance = new UserData();
		}
		return instance;
	}
	
	public ArrayList<User> getUserList() {
		return userList;
	}
	
	
}
