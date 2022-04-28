package test.mypac;

public class Zoo {
/*	
 * 클래스 안에 정의할 수 있는 것 
 * 
 * 생성자 필드 메소드 클래스
 * 
 */
	public class Monkey{
		public void say() {
			System.out.println("나는 원숭이");
		}
	}
	public class Tiger{
		public void say() {
			System.out.println("난느 호랑이");
		}
	}
	//메소드
		//내부클래스로 객체를 생성해서 리턴해주는 메소드
	public Monkey getMonkey() { //Monkey를 리턴
		return new Monkey();
	}
	public Tiger getTiger() {//Tiger를 리턴
		return new Tiger();
	}

}
