package a17_제네릭.User;

import a13_인터페이스2.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data

public class CompanyUser extends User{
	private String membershipNumber;
	
	public CompanyUser(String username, String password, String name, String email, String businessNumber) {
		super(username, password, name, email);
		this.membershipNumber = membershipNumber;
	}

	private String businessNumber;

}
