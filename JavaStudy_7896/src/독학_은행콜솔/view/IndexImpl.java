package 독학_은행콜솔.view;

public class IndexImpl implements Index{
	
	
	
	@Override
	public void show() {  //처음 실행 시키면 첫 화면에 나타나는 창
		System.out.println("[은행 프로그램]");
		System.out.println("1. 로그인");
		System.out.println("2. 회원조회");
		System.out.println("3. 회원가입");
		System.out.println("q. 프로그램 종료");
	}
	
	@Override
	public void showMembership() {
		System.out.println("[회원님을 위한 서비스]");
		System.out.println("1. 입금");
		System.out.println("2. 출금");
		System.out.println("3. 송금");
		System.out.println("4. 대출");
		System.out.println("q. 로그아웃");
		
	}
}
