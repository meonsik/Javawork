package test.main;

public class MainClass08 {
	public static void main(String[] args) {
		//stack 지역변수가 만들어지는 영역 heap 객체가 만들어지는 영역
		String str="abcde12345"; //heap영역에 만들어지는 String type 객체(object)
		//대입 시 str에는 참조값이 담긴다. 23 (id=23)
		int result=str.length();
		char result2=str.charAt(0);
		
		String str2=str.toUpperCase();
		
		/*
		String 객체의 매소드을 활용해
		tr변수 안에 있는 문자를 대응자로 연결해서
		str.2라는 변수를 담아ㅂㅂㅂㅂ바ㅏ
		 */
		String greet="Hello! mimi, Bye! mimi"; //(Object 를 붙여도 가능)
		String greet2= greet.replace("mimi","mama");
		
		String message="My name is Kim";
		
	//* 1. 위의 문자열이 My라는 문자열로 시작 하는지 여부(True or False)를 isStart라는 변수에 담아
		 boolean isStart=message.startsWith("My");
	//* 2. 위의 문자열에서 i가 문자열의 몇번째 인덱스에 위치하고 있는지를 index라는 변수에 담기.
		 int index=message.indexOf("i");
		
	}
	
}
