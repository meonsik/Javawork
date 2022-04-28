package test.main;
	//4.논리 연산자 테스트
public class Mainclass04 {
	public static void main(String[] args) {
		//or 또는. 어느 하나만 true면 결과true . 둘다 false일때만 false
		boolean result1=false||false; //f
		boolean result2=false||true; //t
		boolean result3=true||false; //t
		boolean result4=true||true; //t
		//and 그리고. 모두 true일때만 결과true. 하나만 false면 false
		boolean result5=false && false; //f
		boolean result6=false && true; //f
		boolean result7=true && false; //f
		boolean result8=true && true; //t
		//not 가 아니면 이라고 읽음. boolean 값을 반전
		boolean result9= !true; //f
		boolean result10= !false; //t
	}
}
