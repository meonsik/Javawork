package test.auto;

	public class Car {
		private Engine engine;
	
	//Engine 객체를 인자로 전달받는 생성자.
	public Car(Engine engine) { //인자로 전달 받지 못하면 생성자가 성립 x
		this.engine=engine;
	}
	
	//메소드
	public void drive() {
		if(this.engine==null) {
			System.out.println("Engine객체가 없어서 달릴 수 없다.");
			return; //메소드 끝내기
		}
		System.out.println("Driving~");
	}
	}