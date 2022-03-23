package 독학_은행콜솔.controller;

import java.util.Scanner;

import 독학_은행콜솔.service.UserServiceImpl;
import 독학_은행콜솔.view.Index;
import 독학_은행콜솔.view.Input;

public class PageContoller { 
	private final Index index;
	private final Input input;
	UserServiceImpl userServiceImpl;
	Scanner scanner = new Scanner(System.in);
	
	public PageContoller(Index index, Input input) {
		this.index = index;
		this.input = input;
		userServiceImpl = new UserServiceImpl();
	}
	
	public void start() { //첫 화면을 띄워준 뒤 입력을 받는대로 조건문을 통해 이동할 수 있는 기능을 갖춘 메서드
		while(true) {
			index.show(); //첫 화면 띄워주기 
			char select = input.numberSelect(); //입력값 받은 메서드에서 받은 값을 select 변수에 저장
			if(select == '1') { //입력값으로 1이 들어오면 밑에 메서드 실행
				userServiceImpl.Signin(input.oneSelect()); //로그인을 실행하는 메서드로 이동
				membership();
			}else if(select == '2') { //입력값으로 2가 들어오면 밑에 메서드 실행
				inquire();//아이디로 회원 조회하는 메서드로 이동
				
			}else if(select == '3') { //입력값으로 3가 들어오면 밑에 메서드 실행
				input.threeSelect(); //회원가입을 할 수 있는 메서드로 이동
				
			}else if(select == 'q') { //입력값이 q이면 프로그램을 종료
				System.out.println("프로그램을 종료합니다.");
				break;
			}else { //선택할 수 없는 입력값에 대한 출력
				System.out.println("선택하신 입력값은 없습니다.");
			}
			
		}
		
	}
	
	public void inquire() { //아이디로 회원조회를 할 수 있는 메서드 
		while(true) {
			String username = input.twoSelect();
			userServiceImpl.getUser(username);
			break;
		}
	}
	
	public void membership() {
		while(true) {
			index.showMembership();
			char select = input.numberSelect();
			if(select == '1') {
				
			}else if(select == '2') {
				
			}else if(select == '3') {
				
			}else if(select == '4') {
				
			}else if(select == 'q') {
				System.out.println("로그아웃 되었습니다.");
				break;
			}
		}
	}
	
	
	
}
