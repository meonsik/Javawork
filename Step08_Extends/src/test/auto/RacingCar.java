package test.auto;

public class RacingCar extends Car{

	public RacingCar(Engine engine) {
		super(engine);
	}
	public void booster() {
		System.out.println("�ν���");
	}@Override
	public void drive() {
		super.drive();
		System.out.println("���� ������ Driving~");
		
	}
}
