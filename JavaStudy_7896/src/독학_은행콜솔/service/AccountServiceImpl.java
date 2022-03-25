package 독학_은행콜솔.service;

import java.util.ArrayList;
import java.util.Scanner;

import 독학_은행콜솔.data.UserData;
import 독학_은행콜솔.model.User;

public class AccountServiceImpl implements AccountService{
	Scanner scanner;
	private UserData userData;
	
	public AccountServiceImpl(Scanner scanner) {
		this.userData = UserData.getInstance();
		this.scanner = scanner;
	}
	
	
	@Override
	public void deposit(User user) {
		System.out.println("입금을 선택하셨습니다. ");
		System.out.println("계좌에 입금하실 금액을 입력해주세요: ");
		int money = scanner.nextInt();
		if(user.getMoney() >= money) {
			System.out.println(user.getName() + "님의 계좌에 " + user.deposit(money) + "원을 입금합니다.");
		}else if(user.getMoney() < 1) {
			System.out.println("소지금이 없습니다.");
		}else if(user.getMoney() < money) {
			System.out.println("소지금이 부족합니다.");
		}
		
	}
	
	@Override
	public void withdraw(User user) {
		System.out.println("출금하실 금액을 입력해주세요: ");
		int money = scanner.nextInt();
		if(money < 1) {
			System.out.println("금액을 확인해 주세요");
		}else if(money > user.getSavings()) {
			System.out.println("계좌 잔액이 부족합니다.");
		}else {
			user.withdraw(money);
			System.out.println(user.getName() + "님의 계좌에서 " + money + "원을 출금합니다.");
			System.out.println(user.getName() + "님의 계좌 잔액은 " + user.getSavings() + "원 입니다.");
		}
		
		
	}
	
	@Override
	public void remit(User user) {
		ArrayList<User> users = userData.getUserList();
		System.out.println("송금하실분의 이름을 입력해주세요: ");
		String username = scanner.nextLine();
		for(int i = 0; i < users.size(); i++) {
			if(!(users.get(i).getName().equals(username)) || username == null) {
				System.out.println("잘못 입력하셨습니다!");
				return;
			}else if(users.get(i).getName().equals(username)) {
				System.out.println("송금하실 금액을 입력해주세요: ");
				int money = scanner.nextInt();
				if(money == 0 || money > user.getSavings()) {
					System.out.println("잘못 입력하셨습니다.");
					return;
				}else if(money <= user.getSavings()) {
					users.get(i).inmoney(money);
					user.outmoney(money);
					System.out.println(user.getName() + "님의 잔액은 " + user.getSavings() + "입니다.");
				}
				
			}
		}
	}
	
	@Override
	public void loan(User user) {
		
		
	}
	
}
