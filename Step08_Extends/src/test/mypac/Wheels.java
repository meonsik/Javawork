package test.mypac;

public class Wheels {
	public Wheels() {
		System.out.println("캐릭터 불러오는 중 . . .");
	}
	
	public String name=null;
	public void push() {
		System.out.println(this.name+"를 밀어서 이동 중 . . .");
	}
	public void getIn() {
		System.out.println(this.name+"에 타기");
	}
}
