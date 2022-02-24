package a07_반복;

import java.util.Scanner;

public class GugudanInput {

	public static void main(String[] args) {
		/*
		 * 몇단 부터 몇단 까지 출력할 것인지 입력
		 * start index: 5
		 * end index: 8
		 * 
		 */
		
		Scanner scanner = new Scanner(System.in);
		int startIndex = 0;
		int endIndex = 0;
		
		System.out.print("시작 단: ");
		startIndex = scanner.nextInt();
		System.out.print("마지막 단: ");
		endIndex = scanner.nextInt();
		
//		for(int i = startIndex; i < (endIndex + 1); i++) {
//			System.out.println(i + "단");
//			for(int j = 0; j < 9;) {
//				System.out.println(i + " X " + (++j) + " = " + (i * j));
//			}
//			System.out.println();
//		}
		
		int i = startIndex;
		
		
		while(i < endIndex + 1) {
			
			System.out.println(i + "단");
			
			int j = 0;
			
			while(j < 9) {
				System.out.println(i + " X " + (++j) + " = " + (i * j));
			}
			System.out.println();
			i++;
		}
		
		
		
		
		
	}

}
