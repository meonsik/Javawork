package test.main;

/*
 * -class ����� �տ� abstract �� ����ؼ� Ŭ������ �����Ѵ�.

-���¸� ���ǵǰ� ���� ������ ���� ���� �޼ҵ尡 ������ �� �ִ�.

-���¸� ���ǵ� �޼ҵ带 ���� ���� abstract���� �ٿ��� �޼ҵ��� �����Ѵ�.

-�����ڴ� ���������� �ܵ����� ��ü ������ �Ұ��ϴ�.

-�߻�Ŭ����type�� id�� �ʿ��ϴٸ� �߻�Ŭ������ ��ӹ��� �ڽ�Ŭ������ �����ؼ� ��ü ����.

-�߻�Ŭ������ ��ӹ��� �ڽ�Ŭ������ �θ��� �߻�޼ҵ带 ��� ������ �ؾ��Ѵ�.
 */
import test.mypac.Weapon;
import test.mypac.MyWeapon;

public class MainClass01 {
	public static void main(String[] args) {
		Weapon w1=new MyWeapon(); //������ ��Ƶα⸸ �ϰ�
		w1.prepare();
		w1.attack();
	
		
	}
}
