package test.main;
	//6.3항 연산자
public class MainClass06 {
	public static void main(String[] args) {
		boolean isWait=false;
		//isWait이 true면 "기다려요"가 대입되고 fasle면 "기다리지 않아요"가 대입
		String result=isWait? "기다려요":"기다리지 않아요";
		// = ? : 세가지 연산자로 3항연산. if esle대체
		System.out.println(result);
		
		//위 3항 연사자는 아래처럼 if else 와 같은 로직
		String result2=null;
		if(isWait) {
			result2="기다려요";
			
		}else {
			result2="기다리지 않아요";
		}
	}
}
