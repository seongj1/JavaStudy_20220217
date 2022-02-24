package a07_반복.퀴즈;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		
		System.out.print("반복 횟수 입력: ");
		num = scanner.nextInt();
		
//		for(int i = num; i > 0; i--) {
//			System.out.println(i);
//		}
		
		for(int i = 0; i < num; i++) {
			System.out.println(num - i);
		}

	}

}
