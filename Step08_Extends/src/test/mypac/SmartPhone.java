package test.mypac;

public class SmartPhone extends HandPhone{
	//Constructor
	public SmartPhone() {
		System.out.println("SmartPhone ������ ȣ��� . . .");
	}
	//Method
	public void doInternet() {
		System.out.println("���ͳݿ� ���� . . .");
	}@Override //�θ��� �޼ҵ� ������
	public void takePicture() {
		System.out.println("1000�� ȭ�� �Կ� . . .");
	}
}
