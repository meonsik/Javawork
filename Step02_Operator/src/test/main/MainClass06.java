package test.main;
	//6.3�� ������
public class MainClass06 {
	public static void main(String[] args) {
		boolean isWait=false;
		//isWait�� true�� "��ٷ���"�� ���Եǰ� fasle�� "��ٸ��� �ʾƿ�"�� ����
		String result=isWait? "��ٷ���":"��ٸ��� �ʾƿ�";
		// = ? : ������ �����ڷ� 3�׿���. if esle��ü
		System.out.println(result);
		
		//�� 3�� �����ڴ� �Ʒ�ó�� if else �� ���� ����
		String result2=null;
		if(isWait) {
			result2="��ٷ���";
			
		}else {
			result2="��ٸ��� �ʾƿ�";
		}
	}
}
