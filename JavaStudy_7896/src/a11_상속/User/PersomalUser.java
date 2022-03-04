package a11_상속.User;

public class PersomalUser extends User{
	private String name;
	private String phone;
	
	public PersomalUser() {
		// TODO Auto-generated constructor stub
	}
	
	public PersomalUser(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
}
