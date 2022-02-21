package a01_HelloJava;

/**
 * 
 * 여러줄 주석(클래스 또는 메소드를 설명하는 주석)
 *
 */

/*
 * 
 * 여러줄 주석(여러줄 메모용)
 * 
 */

// 한줄 주석

// 주석의 단축키 Ctrl + /


public class HelloJava { //여기는 HelloJava 선언부입니다.
/**
 * 
 * 프로그램의 시작지점
 * 
 */
	public static void main(String[] args) {
		//'문자' => 'ㅁ'
		//"문자열" => "ㅁㅁㅁㅁ" hello, java
		// 프로그램 실행(Run) 단축키 Ctrl + F11		
		System.out.println("hello, java");
		System.out.println("윤성준\n");
		
		
		/*
		 * 이름: 윤성준
		 * 연락처: 010-9473-7896
		 * 주소: 부산 북구 덕천동
		 */
		
		System.out.print("이름: ");
		System.out.println("윤성준");
		System.out.print("연락처: ");
		System.out.println("010-9473-7896");
		System.out.print("주소: ");
		System.out.print("부산광역시 북구 덕천동");
		
	}

}
