package 독학_은행콜솔.view;

import java.util.Scanner;

import 독학_은행콜솔.model.User;

public class InputImpl implements Input{
	@Override //어떤 명령을 실행할지 매개변수로 문자를 입력받고 반환하는 것을 구현하는 메서드;
	public char typedSelect(Scanner scanner) {
		System.out.println("명령을 입력하세요: ");
		return scanner.next().charAt(0);
	}
	
	@Override
	public User typedUser() {
		// TODO Auto-generated method stub
		return null;
	}
}

