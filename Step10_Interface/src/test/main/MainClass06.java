package test.main;

import test.mypac.Drill;

public class MainClass06 {
	public static void main(String[] args) {
		
		useDrill(new Drill() {

			@Override
			public void hole() {
				System.out.println("��");
				
			}
			
			
		});
		useDrill(()->{ //���� �ڵ带 ���� ǥ��. !!!!!!!!�޼ҵ尡 �ϳ��� ���� �۵��Ѵ�. ���� ���� �ϳ��� Ư���� �� ���� ������
			System.out.println("�վ��");
		});
	}
	//1���� �߻�޼ҵ�� �����Ǿ��ִ� Drill ��ü�� ���ڷ� ���޹޴� �޼ҵ�
	private static void useDrill(Drill d) {
		d.hole();
		
	}
}
