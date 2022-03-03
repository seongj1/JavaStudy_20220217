package a10_배열;

public class UserArrayTest {

	public static void main(String[] args) {
		User[] users = new User[5];
		
		users[0] = new User("seongjun", "1234");
		users[1] = new User("seongjun2", "12345");
		users[2] = new User("seongjun3", "12346");
		users[3] = new User("seongjun4", "12347");
		users[4] = new User("seongjun5", "12348");
		
		
		for(int i = 0; i < users.length; i++) {
//			if(users[i] != null) {
//				users[i].showInfo();
//			}
			if(users[i] == null) {
				continue;
			}
			users[i].showInfo();
		}
		
		System.out.println("===========================");
		
		
		int[] numbers = new int[5];
		
		for(int i = 0; i < users.length; i++) {
			System.out.println(numbers[i]);
		}
	}

}
