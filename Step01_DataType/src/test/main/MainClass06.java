package test.main;

public class MainClass06 {
	public static void main(String[] args) {
		System.out.println("main메소드가시작되었습니다");
		//지역변수는 값을 넣지 않고 선언만 하면 만들어지지 않는다.
		int num1;
		String name1;
		//아직 만들어지지 않았기 때문에 num1 name1은 참조 불가
//		int result=10+num1;
//		System.out.println("name1"+name1);
		System.out.println("main메소드가종료되었습니다");
	}
}
