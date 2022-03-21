package 독학_은행콜솔.view;

import java.util.Scanner;

import 독학_은행콜솔.model.User;

public class InputImpl implements Input{ // 원하는 것을 선택하고 나서 세부 입력값도 받아내는 메소드 구현
	Scanner scanner;
	
	public InputImpl(Scanner scanner) {
		this.scanner = scanner;
	}
	
	public char numberSelect() {
		System.out.println("명령을 입력하세요.");
		char select = scanner.next().charAt(0);
		scanner.nextLine();
		return select;
	}
	
	public String[] oneSelect() { //로그인을 하기위해 아이디와 비밀번호를 입력받는 메서드
		String[] login = new String[2];
		System.out.println("[회원 로그인]");
		System.out.print("아이디: ");
		login[0]= scanner.nextLine();
		System.out.print("비밀번호: ");
		login[1]= scanner.nextLine();
		return login;
	}
	
	public String twoSelect() { //회원가입이 되어있는지 조회하기 위해 아이디를 입력받는 메서드
		System.out.println("[아이디로 회원조회]");
		System.out.println("회원아이디: ");
		return scanner.nextLine();
	}
	
	public User threeSelect() { //회원가입 번호를 입력했을 때 회원의 정보들을 받아서 User 정보에 저장하는 메서드
		User user = new User();
		System.out.println("[회원 가입]");
		System.out.println("회원아이디: ");
		user.setUsername(scanner.nextLine());
		System.out.println("회원비밀번호: ");
		user.setPassword(scanner.nextLine());
		System.out.println("회원이름: ");
		user.setName(scanner.nextLine());
		System.out.println("계좌 비밀번호: ");
		user.setAccountPassword(scanner.nextInt());
		return user;
	}

	
   
}

