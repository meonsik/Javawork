package test.mypac;
/*
 * Ŭ������ ������ �����?
 * 1.��ü�� ���赵 ����. new Car() - ����ȴ�� �ʵ�� �޼ҵ带 ����
 * �� ������ class�� ������(��ü)�� ��. �Ȱ��� ����� ���� �ٸ� ��ü ����
 * �� ���������� Ÿ�� (String PrintStream Car...
 * 2.������ Ÿ���� ����
 * 3.Ŭ������ ��Ȯ�� �ĺ��ϴ� ���? - ��Ű�������� �����ϱ�. test.maypac.Car
 * 4.static �ʵ�� �޼ҵ带�� ���� heap������ ���������� ���еǴ� ��ü.
 * 		stack������ �޼ҵ� ȣ������ ���������� ������� ���ϵǸ� �����
 * `	static������
 */
public class Car {
	//�����(field)
	public String name;
	//�޸��� ���(method)
	public void drive() {
		System.out.println(this.name+"��(��) �޷���!");
	}
	//���ߴ� ���(method) 
	public void stop() {
		System.out.println(this.name+"��(��) �����!");
		
		
	}
}
