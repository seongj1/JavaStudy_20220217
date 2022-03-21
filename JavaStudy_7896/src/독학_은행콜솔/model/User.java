package 독학_은행콜솔.model;

public class User {
	private String username;
	private String password;
	private String name;
	private String accountNumber;
	private int accountPassword;
	private String rank;
	private int savings;
	private int money;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String username, String password, String name, String accountNumber, int accountPassword, String rank, int savings, int money) {
		super();
		this.username = username;
		this.password = password;
		this.name = name;
		this.accountNumber = accountNumber;
		this.accountPassword = accountPassword;
		this.rank = rank;
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
	
	
	
}
