package test.main;
	//4.�� ������ �׽�Ʈ
public class Mainclass04 {
	public static void main(String[] args) {
		//or �Ǵ�. ��� �ϳ��� true�� ���true . �Ѵ� false�϶��� false
		boolean result1=false||false; //f
		boolean result2=false||true; //t
		boolean result3=true||false; //t
		boolean result4=true||true; //t
		//and �׸���. ��� true�϶��� ���true. �ϳ��� false�� false
		boolean result5=false && false; //f
		boolean result6=false && true; //f
		boolean result7=true && false; //f
		boolean result8=true && true; //t
		//not �� �ƴϸ� �̶�� ����. boolean ���� ����
		boolean result9= !true; //f
		boolean result10= !false; //t
	}
}
