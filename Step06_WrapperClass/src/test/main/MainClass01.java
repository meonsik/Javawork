package test.main;
	/*
	 * [기본 data type의 참조 date type]
	 * 
	 * byte		: Byte
	 * short	: Short
	 * int		: Integer
	 * long		: Long
	 * 
	 * float	: Float
	 * double	: Double
	 * 
	 * char		: Character
	 * boolean	: Boolean
	 * 
	 * - 기본데이터 type 의 참조데이터 type이 필요할 때가 있다.
	 * 		기본 데이터 type을 객체에 포장(boxing)하는 형태.
	 * 		boxing unboxing 은 자동으로 이루어지기 때문에 신경 쓸 필요는 없다.
	 *
	 *	기본데이터 타입을 전달하지 못하는 유틸리티에 사용.
	 *	객체에 포장해서 전달하기.
	 */

public class MainClass01 {
	public static void main(String[] args) {
		int num1=10;
		Integer num2=10; //Integer값의 id값이 들어감.

		//참조 데이터 type이지만 기본 데이터type처럼 사용할 수 있다.
		int result1=num2+1;
		int result2=num1+num2;
		Integer result3=num1+num2;
		
		//숫자를 문자로 바꾸기 10 => "10" .toString();
		String strNum=num2.toString();
		//문자를 숫자로 바꾸기 .parseInt("");
		String strNum2="999";
		int result4=Integer.parseInt(strNum2);
		// ㄴ Integer의 static 메소드
		
		
	}

}
