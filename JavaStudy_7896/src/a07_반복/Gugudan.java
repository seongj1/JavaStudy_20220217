package a07_반복;

public class Gugudan {

	public static void main(String[] args) {
//		for(int i = 2; i < 10; i++) {
//			System.out.println(i + "단");
//			
//			for(int j = 0; j < 9; j++) {
//				System.out.println(i + " X " + (j + 1) + " = " + (i * (j + 1)));
//			}
//		}
		
		for(int i = 0; i < 8; i++) {
			int dan = i + 2;
			System.out.println(dan + "단");
			for(int j = 0; j < 9;) {
				System.out.println(dan + " X " + (++j) + " = " + (dan * j));
			}
			System.out.println();
		}
		
	}

}
