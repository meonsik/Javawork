package test.mypac;

public class Member {
	//field 파란색
	public int num;
	public String name;
	public String addr;
	

	//필드에 저장할 값을 전달받는 생성자
	public Member(int num, String name, String addr) {
		//지역변수 num,name,addr (local)
		this.num=num;
		this.name=name; 
		this.addr=addr;
	}
}


//생성자를 잘 활용해서 한줄에 Member를 작성할 수 있음
//javascript에서 object 느낌으로 
//let mem={num:1,name:"kim",addr:"home"} 이것처럼 만들고 싶다!!!!