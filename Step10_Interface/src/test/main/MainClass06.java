package test.main;

import test.mypac.Drill;

public class MainClass06 {
	public static void main(String[] args) {
		
		useDrill(new Drill() {

			@Override
			public void hole() {
				System.out.println("뚫");
				
			}
			
			
		});
		useDrill(()->{ //위의 코드를 줄인 표현. !!!!!!!!메소드가 하나일 때만 작동한다. 여러 개면 하나로 특정할 수 없기 때문에
			System.out.println("뚫어라");
		});
	}
	//1개의 추상메소드로 구성되어있는 Drill 객체를 인자로 전달받는 메소드
	private static void useDrill(Drill d) {
		d.hole();
		
	}
}
