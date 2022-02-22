package a05_입력;

import java.util.Scanner;

//import 단축키 Ctrl + Shift + o 

public class UserInfo {

	public static void main(String[] args) {
		/**
		 * username(아이디) 
		 * password(비밀번호)
		 * year(년도) int
		 * month(월) int
		 * day(일) int
		 * name(이름)
		 * address(주소) 부산 북구 덕천동
		 */
		
		Scanner in = new Scanner(System.in);
		String username = in.next();
		String password = in.next();
		int year = in.nextInt();
		int month = in.nextInt();
		int day = in.nextInt();
		String name = in.next();
		in.nextLine();
		String address = in.nextLine();
		
		
		System.out.println("아이디: " + username);
		System.out.println("비밀번호: " + password);
		System.out.println("생년월일: " + year + "/" + month + "/" + day);
		System.out.println("이름: " + name);
		System.out.println("주소: " + address);		
		
		
	}

}
