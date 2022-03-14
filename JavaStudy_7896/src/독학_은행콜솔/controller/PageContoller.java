package 독학_은행콜솔.controller;

import java.util.Scanner;

import 독학_은행콜솔.view.Index;
import 독학_은행콜솔.view.Input;

public class PageContoller { //Index와 Input의 값을 고정해주는 final 
	private final Index index;
	private final Input input;
	
	public PageContoller(Index index, Input input) { //PageControlle 생성시 매개변수로 인덱스와 인풋을 받아 상수에 전달해주는 메서드
		this.index = index;
		this.input = input;
		
	}
		
	public void index() { //첫 실행되는 창을 띄워주고 선택을 입력받는 메서드
		
		index.show(); // 첫 선택을 하기 위한 보기 창을 띄워준다.
		
		input.typedSelect(new Scanner(System.in)); // typedSelect에 객체를 주입해준다.
	}
}
