package test.main;

import java.util.Scanner;

public class MainClass05 {
	public static void main(String[] args) {
		System.out.println("main메소드가 시작 되었습니다.");
		Scanner scan = new Scanner(System.in);
		System.out.print("문자열 입력: ");
		String str=scan.nextLine(); //리턴은 String. 다음 줄을 읽어오겠다.
		//한줄 입력 받고,받은 문자열을 콘솔에 출력
		
		System.out.println(str);
		System.out.println("main메소드가 종료 됩니다.");
	}
}
