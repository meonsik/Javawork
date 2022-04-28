package test.mypac;

public class Member {
	public int num;
	public String name;
	public String addr;
	// 사용하고 싶은 곳에서 
	// Member m1 = new Member()
	//m1.num , m1.name, m1.addr 과 같이 사용가능.
	
//	메소드
	public void showInfo() {
		//필드에 저장된 내용을 아래와 같은 형식으로 콘솔에 출력하기
		//번호:1, 이름:김구라, 주소:노량진
		System.out.println("번호: "+this.num+",이름: "+this.name+", 주소: "+this.addr);
	}
}

