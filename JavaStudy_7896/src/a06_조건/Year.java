package a06_조건;

import java.util.Scanner;

public class Year {

	public static void main(String[] args) {
		
		/*
		 * 윤년 구분하기 
		 * 1. year변수를 만들어서 년도를 입력받는다.
		 * 2. 연도는 1보다 크거나 같고, 4000보다 작거나 같은 자연수이다.
		 * 3. 윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.
		 */
		
		Scanner scanner = new Scanner(System.in);
		int year = 0;
		
		System.out.print("연도를 입력해주세요: ");
		year = scanner.nextInt();
		
		if(year > 0 && year < 4001) {
			if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
				System.out.println(1);
			}else {
				System.out.println(0);
			}
		}else {
			System.out.println("계산할 수 없는 년도입니다.");
		}
		
//		
//		if(year < 0 && year > 4001) {
//			System.out.println("입력할 수 없는 연도입니다.");
//		}else {
//			if(year % 4 == 0 && (!(year % 100 == 0) || year % 400 == 0)) {
//				year = 1;
//			}else if(year % 4 == 0) && year % 400 == 0) {
//				year = 1;
//			}else {
//				year = 0;
//			}
//			System.out.println(year);
//		}
		

	}

}
