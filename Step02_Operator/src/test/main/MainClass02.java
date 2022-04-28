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
		int result1 = num3++; // result1에 0대입 후 num3 1증가
		
		int num4=0;
		int result2 = ++num4; //num4가 1증가 후 result2에 1 대입
	}
}
