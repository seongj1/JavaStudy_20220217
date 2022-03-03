package a09_클래스_정보은닉;

/*
 * Student  클래스 정의
 * 속성
 * schoolName
 * studentCode(학번) 20220000
 * studentYeat
 * studentName
 * 
 * 생성자(기본, 전체)
 * 
 * getter, setter
 * 
 * 메소드 showStudentInfo
 * 학교명: 코리아아이티아카데미
 * 학번: 20220001
 * 학년: 1학년
 * 이름: 윤성준
 */

public class StudentTest {

	public static void main(String[] args) {
		Student student1 = new Student("코리아아이티아카데미", 20220001, 1, "윤성준");
		Student student2 = new Student("코리아아이티아카데미", 20220002, 3, "윤성주");
		
		student1.setSchoolName("코리아아이티아카데미");
		student1.setStudentCode(20220001);
		student1.setStudentYear(1);
		student1.setStudentName("윤성준");
		
		student1.showStudentInfo();
		student2.showStudentInfo();
 		
		
	}

}
