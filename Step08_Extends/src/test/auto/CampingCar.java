package test.auto;

public class CampingCar extends Car {
	//�ڽ� ��ü�� ��������� ���ؼ� 
	//�θ� ��ü�� �ʿ��ѵ�
	//�θ� ��ü�� �����ڿ� Engine�� �ʿ��ϱ� ������ �Ʒ��� �ڵ尡 �ʿ�.
	public CampingCar(Engine engine) {
		//super()�� �θ�Ŭ������ �����ڸ� ȣ���ϴ� ���� �ǹ��Ѵ�.
		super(engine);// �� ���ٿ� �ڵ� �ۼ��� super ����
		
		
	}
	//�޼ҵ�
	public void sleepInCar() {
		System.out.println("������ �ڱ�");
	}
}
