package a19_예외;

import java.io.IOException;
import java.util.ArrayList;

import a18_컬렉션.ArrayList.Student;

public class ExceptionEx2 {
	
	public void array() throws Exception {
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student()); //0
		students.add(new Student()); //1
		students.add(new Student()); //2
		students.add(new Student()); //3
		students.add(new Student());          //4
		students.add(new Student()); //5
		students.add(new Student()); //6
		students.add(new Student()); //7
		
		for(int i = 0; i < students.size() + 1; i++) {
				Student student = students.get(i);
				student.setName("윤성준");
				System.out.println(student.getName());
		}
		System.out.println("프로그램 종료");

	}

	public static void main(String[] args) {
		ExceptionEx2 ex2 = new ExceptionEx2();
		try {
			ex2.array();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		try {
//			System.out.println("트라이문 끝까지 실행됨?");
//		}catch(NullPointerException e) {
//			System.out.println("주소를 참조할 수 없습니다.");
//		}catch(IndexOutOfBoundsException e) {
//			System.out.println("참조할 수 있는 인덱스의 크기를 초과하였습니다.");
//		}catch(Exception e) {
//			e.printStackTrace();
//		}finally {
//			System.out.println("예외가 발생하든 하지 않든 무조건 실행");
//		}
		
		System.out.println("프로그램 종료");

	}

}
