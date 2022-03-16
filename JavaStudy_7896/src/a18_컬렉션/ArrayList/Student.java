package a18_컬렉션.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student {
	/*
	 * Name
	 * Email
	 * Address
	 */
	private String Name;
	private String Email;
	private String Address;
	
}
