package test.main;
/*
 * [jAVA ���� ������ type]
 * 
 * String type
 * 
 * -���ڿ��� �ٷ궧 ����ϴ� ������ type�̴�.
 */
public class MainClass05 {
	public static void main(String[] args) {
		//"�豸��" ��� String type ��ü�� heap ������ �����
		// �� �������� ������ ���
		String name="�豸��";
		//name�ȿ� �ִ� �������� tmp������ ���� �� �ֱ�
		String tmp=name;
		//"������"��� String type��ü�� heap������ ����� �� �������� name������ �����
		name="������";
		//name������ ���� (null�� ���� ������ type�� ��� �� �ִ� �� ������ �ǹ�)
		name=null;
	}
}
