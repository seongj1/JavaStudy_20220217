package 독학_은행콜솔.data;

import 독학_은행콜솔.model.User;

public class UserData {
	
	private User[] users = new User[10];
	private static UserData instance;
	
	private UserData(User[] users) {
		this.users = users;
	}
	
	private static UserData getInstance(User[] users){
		if(instance == null) {
			instance = new UserData(users);
		}
		return instance;
		
	}
	
	private static UserData getInstance() {
		return instance;
	}
	
	private void showUsers() {
		for(int i = 0; i < users.length; i++) {
			if(users == null) {
				continue;
			}
			System.out.println(users[i]);
		}
		
	}
}
