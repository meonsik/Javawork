package test.mypac;
//printInfo�� �������� �ʰ� �߻�Ŭ������ ���� �� �ִ�.
public abstract class Animal extends Creature{
	//Creature �����ڿ� �ʿ��� x,y,age�� �����ʿ�
	public Animal(int x, int y, int age) {
		super(x, y, age);
		
	}

	@Override
	public void attack() {
		System.out.println("�����ġ��");
	}
}

