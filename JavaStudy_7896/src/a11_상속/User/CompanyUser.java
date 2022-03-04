package a11_상속.User;

public class CompanyUser extends User{
	private String companyName;
	private String companyAddress;
	private String companyTel;
	
	public CompanyUser() {
		// TODO Auto-generated constructor stub
	}
	
	public CompanyUser(String companyName, String companyAddress, String companyTel) {
		this.companyName = companyName;
		this.companyAddress = companyAddress;
		this.companyTel = companyTel;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyAddress() {
		return companyAddress;
	}

	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}

	public String getCompanyTel() {
		return companyTel;
	}

	public void setCompanyTel(String companyTel) {
		this.companyTel = companyTel;
	}
	
	
	
}
