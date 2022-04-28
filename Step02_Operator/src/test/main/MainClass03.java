package test.main;
//비교연산 테스트. 결과는 boolean type 리턴
public class MainClass03 {
	public static void main(String[] args) {
		
		boolean result1 = 10 == 10; //t
		boolean result2 = 10 != 100; //t
		boolean result3 = 10 > 100; //f
		boolean result4 = 10 >= 10; //t
		boolean result5 = 10 < 100; //t
		boolean result6 = 10 <= 10; //t

		// String type변수 name에 null대입
		String name=null;
		//null인지 아닌지 비교 가능 
		boolean result7 = name == null; //t
		boolean result8 = name != null; //f
		
	}
	
}