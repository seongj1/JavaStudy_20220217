package 독학_은행콜솔.view;

import java.util.Scanner;

import 독학_은행콜솔.model.User;

public interface Input {
	public char typedSelect(Scanner scanner); // 입력값을 매개변수로 받는 틀
	public User typedUser();
	
}
