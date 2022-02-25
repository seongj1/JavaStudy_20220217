package a07_반복.퀴즈;

import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = 0;
		
		System.out.println("반복 횟수 입력: ");
		n = scanner.nextInt();
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
