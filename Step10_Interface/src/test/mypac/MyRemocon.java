package test.mypac;

public class MyRemocon implements Remocon{
	//�������̽��� �߻�޼ҵ���� ������ ������ �ʿ䰡 �ְ���??
	@Override
	public void up() {
		System.out.println("ä�ο÷�");
	}

	@Override
	public void down() {
		System.out.println("ä�γ���");
	}
	//Ŭ������ ��ӹ��� ���� extends
	//�������̽��� ��ӹ��� ���� implements
}
