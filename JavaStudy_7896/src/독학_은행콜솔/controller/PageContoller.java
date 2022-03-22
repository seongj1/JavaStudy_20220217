package 독학_은행콜솔.controller;

import java.util.Scanner;

import 독학_은행콜솔.view.Index;
import 독학_은행콜솔.view.Input;

public class PageContoller { 
	private final Index index;
	private final Input input;
	
	public PageContoller(Index index, Input input) {
		this.index = index;
		this.input = input;
	}
	
	public void start() {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			index.show();
			char select = input.numberSelect();
			if(select == '1') {
				input.oneSelect();
			}else if(select == '2') {
				input.twoSelect();
				
			}else if(select == '3') {
				input.threeSelect();
			}else if(select == 'q') {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else {
				System.out.println("선택하신 입력값은 없습니다.");
			}
			
		}
	}
}
