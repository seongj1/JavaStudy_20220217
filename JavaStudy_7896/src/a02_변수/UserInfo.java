package a02_변수;

public class UserInfo {

	public static void main(String[] args) {
		/*
		 * 학번: 20220001    -> studentCode(정수)
		 * 이름: 윤성준      -> name1, name2, name3
		 * 학년: 1           -> studentYear(정수)
		 * 성적: 85.5        -> score(실수)
		 * 평점: B           -> grade(문자)
		 * 성별: 남성(true), 여성(false) -> gender(boolean)
		 */
		
		int studentCode = 20220001;
		char name1 = '윤';
		char name2 = '성';
		char name3 = '준';
		int  studentYear = 1;
		double score = 85.5;
		char grade ='B';
		boolean gender = true;
		
		System.out.println("학번: " + studentCode);
		System.out.print("이름: ");
		System.out.println("" + name1 + name2 + name3);
		System.out.print("학년: ");
		System.out.println(studentYear);
		System.out.print("성적: ");
		System.out.println(score);
		System.out.print("평점: ");
		System.out.println(grade);
		System.out.print("성별: ");
		System.out.print(gender);
	
		
		
		
	}

}
