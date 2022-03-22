package 독학_은행콜솔.service;

import java.util.ArrayList;

import 독학_은행콜솔.data.UserData;
import 독학_은행콜솔.model.User;

public class AccountServiceImpl implements AccountService{
	private UserData userData;
	
	public AccountServiceImpl() {
		userData = UserData.getInstance();
		
	}
	
	public void Signin(String[] loginData) {
		ArrayList<User> users = userData.getUserList();
		for(int i = 0; i < users.size(); i++) {
			User user = users.get(i);
			if(user.getUsername().equals(loginData[0])) {
				if(user.getPassword().equals(loginData[1])) {
					
				}else {
					System.out.println("비밀번호가 틀렸습니다.");
				}
			}else {
				System.out.println("아이다가 틀렸습니다.");
			}
		}
		
	}
	
}
