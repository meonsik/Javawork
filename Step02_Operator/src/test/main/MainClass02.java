package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		int num=0;
		num++;
		num++;
		num++;
		
		int num2=0;
		num2--;
		num2--;
		num2--;
		
		int num3=0;
		int result1 = num3++; // result1�� 0���� �� num3 1����
		
		int num4=0;
		int result2 = ++num4; //num4�� 1���� �� result2�� 1 ����
	}
}
