package test.main;

import java.util.Scanner;

public class MainClass06 {
	/*
	 * Scanner 객체를 이용해서 문자열을 5번 입력받기
	 * 입력 받은 문자열은 차례대로 배열에 저장
	 * 모두다 입력 받은 후 for 문을 이용해서 배열에 저장된
	 * 모든 문자열을 콘솔창에 순서대로 출력하는 코드를 작성하기...
	 */
	public static void main(String[] args) {
		System.out.println("main시작");
		Scanner scan=new Scanner(System.in);
		
		String[] strs=new String[5];
		
		for(int i=0;i<5;i++) {
			System.out.print("입력하세요 "+i+"번째:");
			//new.scanner를 여기에 작성하면 객체가 5개 생성된다. 
			strs[i]=scan.nextLine();
		}
		for(int i=0;i<5;i++) {
			System.out.println(strs[i]);
		}
		System.out.println("종료");
		/*
		 *      
	Scanner scan=new Scanner(System.in);
    String[] msgs=new String[5];      
      for(int i=0; i<msgs.length; i++) {
         System.out.print("문자열 입력:");
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
