package test.main;

public class MainClass08 {
	public static void main(String[] args) {
		//stack ���������� ��������� ���� heap ��ü�� ��������� ����
		String str="abcde12345"; //heap������ ��������� String type ��ü(object)
		//���� �� str���� �������� ����. 23 (id=23)
		int result=str.length();
		char result2=str.charAt(0);
		
		String str2=str.toUpperCase();
		
		/*
		String ��ü�� �żҵ��� Ȱ����
		tr���� �ȿ� �ִ� ���ڸ� �����ڷ� �����ؼ�
		str.2��� ������ ��Ƥ��������٤�
		 */
		String greet="Hello! mimi, Bye! mimi"; //(Object �� �ٿ��� ����)
		String greet2= greet.replace("mimi","mama");
		
		String message="My name is Kim";
		
	//* 1. ���� ���ڿ��� My��� ���ڿ��� ���� �ϴ��� ����(True or False)�� isStart��� ������ ���
		 boolean isStart=message.startsWith("My");
	//* 2. ���� ���ڿ����� i�� ���ڿ��� ���° �ε����� ��ġ�ϰ� �ִ����� index��� ������ ���.
		 int index=message.indexOf("i");
		
	}
	
}
