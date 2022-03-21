package 독학_은행콜솔.view;

import 독학_은행콜솔.model.User;

public interface Input { //각 선택 영역을 눌렀을 때 띄워줄 창들 
	public char numberSelect();
	public String[] oneSelect();
	public String twoSelect();
	public User threeSelect();
}
