package test.auto;

public class RacingCar extends Car{

	public RacingCar(Engine engine) {
		super(engine);
	}
	public void booster() {
		System.out.println("부스터");
	}@Override
	public void drive() {
		super.drive();
		System.out.println("좀더 빠르게 Driving~");
		
	}
}
