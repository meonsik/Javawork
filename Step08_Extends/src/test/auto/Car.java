package test.auto;

	public class Car {
		private Engine engine;
	
	//Engine ��ü�� ���ڷ� ���޹޴� ������.
	public Car(Engine engine) { //���ڷ� ���� ���� ���ϸ� �����ڰ� ���� x
		this.engine=engine;
	}
	
	//�޼ҵ�
	public void drive() {
		if(this.engine==null) {
			System.out.println("Engine��ü�� ��� �޸� �� ����.");
			return; //�޼ҵ� ������
		}
		System.out.println("Driving~");
	}
	}