package test.mypac;

public class Zoo {
/*	
 * Ŭ���� �ȿ� ������ �� �ִ� �� 
 * 
 * ������ �ʵ� �޼ҵ� Ŭ����
 * 
 */
	public class Monkey{
		public void say() {
			System.out.println("���� ������");
		}
	}
	public class Tiger{
		public void say() {
			System.out.println("���� ȣ����");
		}
	}
	//�޼ҵ�
		//����Ŭ������ ��ü�� �����ؼ� �������ִ� �޼ҵ�
	public Monkey getMonkey() { //Monkey�� ����
		return new Monkey();
	}
	public Tiger getTiger() {//Tiger�� ����
		return new Tiger();
	}

}
