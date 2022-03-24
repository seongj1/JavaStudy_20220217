package 독학_은행콜솔.model;

public class User { //회원들의 정보를 저장하는 클래스
	private static int lastIncrement = 0;
	private String username;
	private String password;
	private String name;
	private String accountNumber;
	private int accountPassword;
	private String rank;
	private int savings;
	private int money;
	

	public User(String username, String password, String name, int accountPassword,int money) {
		super();
		accountNumber = "979-01019-0000" + (++lastIncrement);
		this.username = username;
		this.password = password;
		this.name = name;
		this.accountPassword = accountPassword;
		this.money = money;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getAccountPassword() {
		return accountPassword;
	}

	public void setAccountPassword(int accountPassword) {
		this.accountPassword = accountPassword;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public int getSavings() {
		return savings;
	}

	public void setSavings(int savings) {
		this.savings = savings;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", name=" + name + ", accountNumber="
				+ accountNumber + ", rank=" + rank + ", savings=" + savings
				+ ", money=" + money + "]";
	}
	
	public int deposit(int money) {
		savings += money;
		this.money -= money;
		return money;
	}
	
	public int withdraw(int money) {
		savings -= money;
		this.money += money;
		return this.money;
	}
}
