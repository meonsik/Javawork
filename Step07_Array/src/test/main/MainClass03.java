package test.main;

public class MainClass03 {
	//String type�� ���� �� �ִ� �� 3��¥�� �� �迭��ü�� �����
	//�������� �������� names�� ���
	
	public static void main(String[] args) {
		String[] names=new String[3];
		String[] names2={null,null,null};
		names[0]="�豸��";
		names[1]="�ذ�";
		names[2]="������";
		
		for(int i=0; i<names.length; i++) {
			//i��° String type��ü�� �����ؼ�
			String tmp=names[i];
			//����ϱ�
			System.out.println(tmp);
		}
	}
}
