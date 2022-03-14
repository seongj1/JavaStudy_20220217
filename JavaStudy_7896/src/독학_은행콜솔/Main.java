package 독학_은행콜솔;

import 독학_은행콜솔.controller.PageContoller;
import 독학_은행콜솔.view.IndexImpl;
import 독학_은행콜솔.view.InputImpl;

public class Main {

	public static void main(String[] args) {
		PageContoller pageContoller = new PageContoller(new IndexImpl(), new InputImpl()); //페이지 컨트롤러를 생성하면서 매개변수로 각 객체를 생성한다.
		pageContoller.index();// 첫 선택 보기 창과 입력을 받을 수 있는 메서드이다.

	}

}
