package test.mypac;
//printInfo를 정의하지 않고 추상클래스로 만들 수 있다.
public abstract class Animal extends Creature{
	//Creature 생성자에 필요한 x,y,age값 전달필요
	public Animal(int x, int y, int age) {
		super(x, y, age);
		
	}

	@Override
	public void attack() {
		System.out.println("몸통박치기");
	}
}

