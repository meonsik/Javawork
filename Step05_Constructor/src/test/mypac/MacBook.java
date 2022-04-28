package test.mypac;

public class MacBook {
	//private는 이 class, 객체안에서만 사용가능하다.
	//외부에서 접근 불가토록 접근 지정자를 private로 필드 3개 선언
	private Cpu cpu;
	private Memory memory;
	private HardDisk hardDisk;
	
	//생성자
	public MacBook(Cpu cpu,Memory memory,HardDisk hardDisk){
		//지역변수와 똑같은 이름이라 this 생략불가.
		this.cpu=cpu;
		this.memory=memory;
		this.hardDisk=hardDisk;
		
		
	}
	//메소드
	public void doGame() {
		if(this.cpu==null||this.memory==null||this.hardDisk==null) {
			//동일한 멤버끼리 this 생략가능
			System.out.println("부품이 부족해서 맥북 동작 불가.");
			return; //메소드를 여기서 끝내기.
		}
		System.out.println("신나게 게임을 해요!");
	}
}
