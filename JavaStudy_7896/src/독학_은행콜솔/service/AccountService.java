package 독학_은행콜솔.service;

import 독학_은행콜솔.model.User;

public interface AccountService {
	public void deposit(User user);
	public void withdraw(User user);
	public void remit(User user);
	public void loan(User user);
	
	
}
