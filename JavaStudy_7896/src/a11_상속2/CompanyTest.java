package a11_상속2;

public class CompanyTest {

	public static void main(String[] args) {
		ElectronicsCompany samsung = new ElectronicsCompany();
		ElectronicsCompany lg = new ElectronicsCompany();
		DeliveryCompany baemin = new DeliveryCompany();
		DeliveryCompany yogiyo = new DeliveryCompany();
		
		samsung.setCompanyName("삼숭");
		
		Company samsung_company = samsung;
		Company lg_company = lg;
		Company baemin_company = baemin;
		Company yogiyo_company = yogiyo;
		
		samsung_company.setCompanyName("삼성");
		
//		samsung.setCompanyName("삼성전자");
		lg.setCompanyName("LG");
		baemin.setCompanyName("배달의 민족");
		yogiyo.setCompanyName("요기요");
		
		
		samsung.showCompanyInfo();
		lg.showCompanyInfo();
		baemin.showCompanyInfo();
		yogiyo.showCompanyInfo();
		
		samsung.addFactory();
		lg.addFactory();
		baemin.addMotorcycle();
		
		samsung_company.showCompanyInfo();
//		DeliveryCompany down_samsung_Company = (DeliveryCompany)samsung_company;
//		down_samsung_Company.addMotorcycle();
//		ElectronicsCompany down_samsung_company = (ElectronicsCompany)samsung_company;
//		down_samsung_company.addFactory();
//		
//		//업캐스팅이 없는 다운캐스팅은 안된다.
//		Company c = new Company();
//		ElectronicsCompany ec = (ElectronicsCompany)c;
//		ec.addFactory();
		
		
	}
	
}
