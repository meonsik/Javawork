package test.mypac;

public class MyRemocon implements Remocon{
	//인터페이스의 추상메소드들을 실제로 구현할 필요가 있겠죠??
	@Override
	public void up() {
		System.out.println("채널올랴");
	}

	@Override
	public void down() {
		System.out.println("채널내렴");
	}
	//클래스를 상속받을 때는 extends
	//인터페이스를 상속받을 때는 implements
}
