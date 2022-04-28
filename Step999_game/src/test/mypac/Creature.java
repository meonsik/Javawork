package test.mypac;

public abstract class Creature{
//Creature���� �����ϴ� �Ӽ�.
	//�ʵ� ����
	private int x;
	private int y;
	private int age;
	//������ x,y,age�� ���ڷ� �޾ƾ��ϰ� �̰��� ���� age,x,y�� ������.
	public Creature(int x,int y,int age) {
		this.x=x;
		this.y=y;
		this.age = age;
	}
	//�޼ҵ� ���� �ѻ� �߰�
	public void age() {
		age++;
	}
	//���� xDistance�� ���ڷ� �ް� x�� xDistance��ŭ ���� ����
	public void move(int xDistance) {
		x += xDistance;
	}
	//x���� �������ش�
	public int getX() {
        return x;
    }
	//x���� ���ڷ� �ް� Creature�� x�� ����x �� ������.
    public void setX(int x) {
        this.x = x;
    }
    //y���� ����
    public int getY() {
        return y;
    }
    
    //y���� ���ڷ� �ް� Creature�� y�� ���� y�� ������.
    public void setY(int y) {
        this.y = y;
    }
    
    //�߻�Ŭ������ ���� Animal, Human�� attack �޼ҵ带 �����
    //�׷��� ���� ���ݹ���� �ٸ��� �� �Ŵϱ� Animal�� Human���� ���� ���ݹ�� ����.
    public abstract void attack();
    public abstract void printInfo();
	
}
