package 독학_은행콜솔;

import java.util.Scanner;

import 독학_은행콜솔.controller.PageContoller;
import 독학_은행콜솔.service.AccountServiceImpl;
import 독학_은행콜솔.view.IndexImpl;
import 독학_은행콜솔.view.InputImpl;

public class MainTest {
	
	
	public static void main(String[] args) {
		PageContoller pageContoller = new PageContoller(new IndexImpl(), new InputImpl(new Scanner(System.in)));
		pageContoller.start();
	}

}
