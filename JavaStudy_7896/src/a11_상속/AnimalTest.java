package a11_상속;

public class AnimalTest {

	public static void main(String[] args) {
		Human human = new Human();
		Eagle eagle = new Eagle();
		Tiger tiger = new Tiger();
		
		human.move();
		eagle.move();
		tiger.move();
		
		human.readBooks();
		eagle.flying();
		tiger.hunting();
		//업캐스팅 전
		/////////////////////////
		//업캐스팅 후
		Animal ah = human;
		Animal ae = eagle;
		Animal at = tiger;
		
		ah.move();
		ae.move();
		at.move();
		
		Human hh = (Human)ah;
		hh.readBooks();
		Eagle ee = (Eagle)ae;
		ee.flying();
		Tiger tt = (Tiger)at;
		tt.hunting();
		
		Animal[] animals = new Animal[3];
		animals[0] = human;
		animals[1] = eagle;
		animals[2] = tiger;
		
		for(int i = 0; i < animals.length; i++) {
			animals[i].move();
		}
		for(int i = 0; i < animals.length; i++) {
			//instanceof(업캐스팅 되기 전의 자료형을 비교)
			if(animals[i] instanceof Human) {
				Human h = (Human)animals[i];
				h.readBooks();
			}else if(animals[i] instanceof Eagle) {
				Eagle e = (Eagle)animals[i];
				e.flying();
			}else if(animals[i] instanceof Tiger) {
				Tiger t = (Tiger)animals[i];
				t.hunting();
			}
		}
	}

}
