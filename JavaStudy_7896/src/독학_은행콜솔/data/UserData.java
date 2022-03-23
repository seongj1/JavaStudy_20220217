package 독학_은행콜솔.data;

import java.util.ArrayList;

import 독학_은행콜솔.model.User;

public class UserData { //회원가입하는 회원들의 정보들을 저장하는 리스트를 만드는 클래스
	private static UserData instance;
	private ArrayList<User> userList;
	
	private UserData() {
		userList = new ArrayList<User>();
	}
	
	public static UserData getInstance() { //UserData가 생성될 때 instance안에 값이 없으면 넣어주고 있으면 반환해주는 메서드
		if(instance == null) {
			instance = new UserData();
		}
		return instance;
	}
	
	public ArrayList<User> getUserList() { //리스트를 사용하기 위한 메서드
		return userList;
	}
	
	
}
