package test.main;

import java.util.Scanner;

public class MainClass06 {
	/*
	 * Scanner ��ü�� �̿��ؼ� ���ڿ��� 5�� �Է¹ޱ�
	 * �Է� ���� ���ڿ��� ���ʴ�� �迭�� ����
	 * ��δ� �Է� ���� �� for ���� �̿��ؼ� �迭�� �����
	 * ��� ���ڿ��� �ܼ�â�� ������� ����ϴ� �ڵ带 �ۼ��ϱ�...
	 */
	public static void main(String[] args) {
		System.out.println("main����");
		Scanner scan=new Scanner(System.in);
		
		String[] strs=new String[5];
		
		for(int i=0;i<5;i++) {
			System.out.print("�Է��ϼ��� "+i+"��°:");
			//new.scanner�� ���⿡ �ۼ��ϸ� ��ü�� 5�� �����ȴ�. 
			strs[i]=scan.nextLine();
		}
		for(int i=0;i<5;i++) {
			System.out.println(strs[i]);
		}
		System.out.println("����");
		/*
		 *      
	Scanner scan=new Scanner(System.in);
    String[] msgs=new String[5];      
      for(int i=0; i<msgs.length; i++) {
         System.out.print("���ڿ� �Է�:");
         String msg=scan.nextLine();
         msgs[i]=msg;
      }
      
      for(int i=0; i<msgs.length; i++) {
         String tmp=msgs[i];
         System.out.println(tmp);
      }

		 */
		
		
	}
}
