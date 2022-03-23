package 독학_은행콜솔.service;

import java.util.Scanner;

public class AccountServiceImpl implements AccountService{
	Scanner scanner;
	
	public AccountServiceImpl(Scanner scanner) {
		this.scanner = scanner;
	}
	
	
	@Override
	public void deposit() {
		
		System.out.println("입금하실 금액을 입력해주세요: ");
		scanner.nextInt();
	}
	
	@Override
	public void withdraw() {
		System.out.println("출금하실 금액을 입력해주세요: ");
		scanner.nextInt();
		System.out.println("계좌의 비밀번호를 입력해주세요: ");
		scanner.nextInt();
		
	}
	
	@Override
	public void remit() {
		
		
	}
	
	@Override
	public void loan() {
		
		
	}
	
}
