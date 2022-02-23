package a05_입력;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		/*
		 * 세 수를 입력 받는다.
		 * 
		 * 세 수를 입력하세요:
		 * 10 20 30
		 * 
		 * 세수의 합: 60
		 * 
		 * 세 수를 입력하세요: 5 2 1
		 * 
		 * 세 수의 곱: 10
		 * 
		 * 세 수를 입력하세요: 50 2 2
		 * 
		 * 앞의 두수의 곱에 세번째 수로 나눈 나머지: 0
		 */
		
		Scanner scanner = new Scanner(System.in);
		int x = 0;
		int y = 0;
		int z = 0;
		int result = 0;
		
		
		System.out.print("세 수를 입력하세요: ");
		x = scanner.nextInt();
		y = scanner.nextInt();
		z = scanner.nextInt();
		result = x + y + z;
		System.out.println("세 수의 합: " + result);
		
		System.out.print("세 수를 입력하세요: ");
		x = scanner.nextInt();
		y = scanner.nextInt();
		z = scanner.nextInt();
		result = x * y * z;
		System.out.println("세 수의 곱: " + result);
		
		System.out.print("세 수를 입력하세요: ");
		x = scanner.nextInt();
		y = scanner.nextInt();
		z = scanner.nextInt();
		result = (x * y) % z;
		System.out.println("앞의 두수의 곱에 세번째 수로 나눈 나머지: " + result);
		
	

	}

}
