package test.mypac;
/*
 * [�޼ҵ带 ���� �� ����ؾ� �ϴ� ��]
 * 1.���������� //public
 * 2.static
 * 3.����type
 * 4.�޼ҵ��
 * 5.�޼ҵ忡 �����ϴ� ������ ������ ������ type
 */
public class MyObject {
	/*
	 * public => ��𼭵� ���� ����
	 * void => � ���� �������� ����
	 * walk => �޼ҵ��
	 * walk() => � ���� ���� ���� �ʴ´�.
	 */
	public void walk() {
		System.out.println("�ɾ��!");	
	}
	//int type�� ������ �ִ� �޼ҵ�
	public int getNumber() {
		return 10;
	}
	public String getGreeting() {
		return "Hi!";
	}
	public Car getCar() {//getCar()�� �Է��ϸ� Car type Car��ü�� �ҷ�������.
		return new Car();
	}
	//int type�� �޼ҵ��� '����'�� ���޹޴� �޼ҵ�
		//���ڴ� �Ű�����. ȣ��Ǹ� �������. 
	public void setNum(int num) {
		System.out.println("num:"+num);
	}
	//String type�� �޼ҵ��� ���ڷ� ���޹޴� �޼ҵ�
	public void setName(String name) {
		System.out.println("name:"+name);
	}
	//Car type�� �޼ҵ��� ���ڷ� ���޹޴� �޼ҵ�
	public void useCar(Car car) {
		car.drive();
	}
	//Radio type�� Speaker type�� ���޹޴� �޼ҵ�
	public void listenMusic(Radio r, Speaker s) {
		System.out.println("���ǵ��");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
