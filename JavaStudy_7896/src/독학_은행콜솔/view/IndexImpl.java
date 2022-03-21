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
}
