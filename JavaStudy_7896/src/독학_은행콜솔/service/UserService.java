package 독학_은행콜솔.service;

import 독학_은행콜솔.model.User;

public interface UserService { //로그인을 하기위한 틀을 만드는 인터페이스

	public User Signin(String[] loginData); //로그인 기능을 담당하는 틀 
	public void getUser(String username); //아이디로 회원 조회를 담당하는 틀
}
