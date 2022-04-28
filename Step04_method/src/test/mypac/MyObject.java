package test.mypac;
/*
 * [메소드를 만들 때 고려해야 하는 것]
 * 1.접근지정자 //public
 * 2.static
 * 3.리턴type
 * 4.메소드명
 * 5.메소드에 전달하는 인자의 갯수와 데이터 type
 */
public class MyObject {
	/*
	 * public => 어디서든 접근 가능
	 * void => 어떤 값도 리턴하지 않음
	 * walk => 메소드명
	 * walk() => 어떤 값도 전달 받지 않는다.
	 */
	public void walk() {
		System.out.println("걸어요!");	
	}
	//int type을 전달해 주는 메소드
	public int getNumber() {
		return 10;
	}
	public String getGreeting() {
		return "Hi!";
	}
	public Car getCar() {//getCar()를 입력하면 Car type Car객체가 불러와진다.
		return new Car();
	}
	//int type을 메소드의 '인자'로 전달받는 메소드
		//인자는 매개변수. 호출되면 사라진다. 
	public void setNum(int num) {
		System.out.println("num:"+num);
	}
	//String type을 메소드의 인자로 전달받는 메소드
	public void setName(String name) {
		System.out.println("name:"+name);
	}
	//Car type을 메소드의 인자로 전달받는 메소드
	public void useCar(Car car) {
		car.drive();
	}
	//Radio type과 Speaker type을 전달받는 메소드
	public void listenMusic(Radio r, Speaker s) {
		System.out.println("음악듣기");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
