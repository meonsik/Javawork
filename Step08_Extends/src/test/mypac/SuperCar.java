package test.mypac;

public class SuperCar extends Cart{
	public SuperCar() {
		System.out.println("�ν��� ��� �߰���");
	}
	public void booster() {
		System.out.println("�ν���");
	}@Override
	public void drive() {
		System.out.println(this.name+"��(��) �ü� 1000km�� ���� �� . . .");
	}
}
