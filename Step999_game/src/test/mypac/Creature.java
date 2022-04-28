package test.mypac;

public abstract class Creature{
//Creature끼리 공유하는 속성.
	//필드 선언
	private int x;
	private int y;
	private int age;
	//생성자 x,y,age를 인자로 받아야하고 이것의 인자 age,x,y를 정의함.
	public Creature(int x,int y,int age) {
		this.x=x;
		this.y=y;
		this.age = age;
	}
	//메소드 나이 한살 추가
	public void age() {
		age++;
	}
	//정수 xDistance를 인자로 받고 x에 xDistance만큼 값을 더함
	public void move(int xDistance) {
		x += xDistance;
	}
	//x값을 리턴해준다
	public int getX() {
        return x;
    }
	//x값을 인자로 받고 Creature의 x를 인자x 로 정의함.
    public void setX(int x) {
        this.x = x;
    }
    //y값을 리턴
    public int getY() {
        return y;
    }
    
    //y값을 인자로 받고 Creature의 y를 인자 y로 정의함.
    public void setY(int y) {
        this.y = y;
    }
    
    //추상클래스를 만들어서 Animal, Human에 attack 메소드를 만들기
    //그러나 서로 공격방식은 다르게 할 거니까 Animal과 Human에서 각각 공격방식 정의.
    public abstract void attack();
    public abstract void printInfo();
	
}
