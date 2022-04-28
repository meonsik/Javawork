package test.mypac;

public class Member {
	//멤버번호,이름,주소를 필드에 저장하기
	public int num;
	public String name;
	public String type;
	public void showInfo() {
		System.out.println(this.num+"번째 포켓몬정보: "+this.name+" "
	+this.type+"타입");
	}
	public Car getCar() {
		return new Car();
		
	}
}

