package test.mypac;

public class Member {
	//�����ȣ,�̸�,�ּҸ� �ʵ忡 �����ϱ�
	public int num;
	public String name;
	public String type;
	public void showInfo() {
		System.out.println(this.num+"��° ���ϸ�����: "+this.name+" "
	+this.type+"Ÿ��");
	}
	public Car getCar() {
		return new Car();
		
	}
}

