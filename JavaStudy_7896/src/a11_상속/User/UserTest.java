package a11_상속.User;

public class UserTest {

	public static void main(String[] args) {
		PersomalUser user = new PersomalUser();
		user.setUsername("seongjun");
		user.setPassword("1234");
		
		System.out.println(user.login("seongjun", "1234"));
	}

}
