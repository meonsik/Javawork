package test.main;
//�񱳿��� �׽�Ʈ. ����� boolean type ����
public class MainClass03 {
	public static void main(String[] args) {
		
		boolean result1 = 10 == 10; //t
		boolean result2 = 10 != 100; //t
		boolean result3 = 10 > 100; //f
		boolean result4 = 10 >= 10; //t
		boolean result5 = 10 < 100; //t
		boolean result6 = 10 <= 10; //t

		// String type���� name�� null����
		String name=null;
		//null���� �ƴ��� �� ���� 
		boolean result7 = name == null; //t
		boolean result8 = name != null; //f
		
	}
	
}