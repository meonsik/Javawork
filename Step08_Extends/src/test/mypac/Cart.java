package test.mypac;

public class Cart extends Wheels{
	public Cart() {
		System.out.println("의자와 엔진 장착됨");
		
	}
	public void sit() {
		System.out.println(this.name+"에 앉기");
	}
	public void drive() {
		System.out.println(this.name+"을(를) 시속 10km로 운전 중 . . .");
	}

}
