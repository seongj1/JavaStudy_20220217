package a18_컬렉션.HashMap;

import java.util.HashMap;

public class StudentTest {

	public static void main(String[] args) {
		StudentService service = new StudentService(new HashMap<String, Student>());
		
		service.showStudentAll();
		
		service.addStudent("김준일", "aaa@gmail.com", "부산 동래구");
		service.addStudent("김준이", "bbb@gmail.com", "부산 진구");
		service.addStudent("김준삼", "ccc@gmail.com", "부산 북구");
		service.showStudentAll();
		
		service.updateStudentByName("김준일", "ddd@gmail.com", "부산 북구");
		service.showStudentByName("김준일");
		
		service.deleteStudentByName("김준이");
		service.showStudentAll();

	}

}
