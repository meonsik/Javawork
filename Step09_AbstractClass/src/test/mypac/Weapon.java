package test.mypac;

public abstract class Weapon {
	//���� �۵��� �غ��ϴ� �޼ҵ�
	public void prepare() {
		System.out.println("���� �۵� �غ�");
	}
	//������ �ϴ� �޼ҵ��� ��縸 �����ϰ� ���� ������ ���� �ʱ�.
	//�̿ϼ��� �߻�޼ҵ带 ���� ���� abstract ���� �ʿ�.
	
	public abstract void attack();

}
