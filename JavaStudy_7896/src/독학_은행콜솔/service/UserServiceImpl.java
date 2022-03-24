package 독학_은행콜솔.service;

import java.util.ArrayList;

import 독학_은행콜솔.data.UserData;
import 독학_은행콜솔.model.User;

public class UserServiceImpl implements UserService{ //로그인를 위한 인터페이스를 구현하는 클래스
	private UserData userData;
	
	public UserServiceImpl() {
		userData = UserData.getInstance();
		
	}
	
	public User Signin(String[] loginData) { //로그인 기능을 담당하는 메서드
		ArrayList<User> users = userData.getUserList();
		User info = null;
		for(int i = 0; i < users.size(); i++) {
			User user = users.get(i);
			if(user.getUsername().equals(loginData[0])) {
				if(user.getPassword().equals(loginData[1])) {
					System.out.println(user.getName() + "님 반갑습니다.");
					info = user;
					return info;
				}else {
					System.out.println("비밀번호가 틀렸습니다.");
				}
			}else {
				System.out.println("아이디가 틀렸습니다.");
			}
		}return info;
		
	}
	
	public void getUser(String username) { //아이디를 받아 회원정보와 비교해서 찾은 뒤 정보를 반환하는 메서드
		ArrayList<User> users = userData.getUserList();
		User user = null;
		for(int i = 0; i < users.size(); i++) {
			user = users.get(i);
			if(!users.isEmpty() && user.getUsername().equals(username)) {
				System.out.println(user);
				return;
			}
		}
		System.out.println("입력하신 회원을 찾을 수 없습니다.");
	}
	
}
