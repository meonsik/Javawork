package test.main;

import test.mypac.Zoo;
import test.mypac.Zoo.Monkey;
import test.mypac.Zoo.Tiger;
/*
 * Ŭ���� �ȿ� ���� Ŭ���� : inner class
 * �޼ҵ� �ȿ� ���� Ŭ���� : local inner class
 */
public class MainClass03 {
	public static void main(String[] args) {
		//zooŬ������ �ִ� getMonkey()�޼ҵ带 ȣ���ؼ�
		//���� ���� m1 ���� ������ ���.
		Zoo zoo=new Zoo();
		Monkey m1=zoo.getMonkey();
		m1.say();
		Tiger t1=zoo.getTiger();
		t1.say();
		//�޼ҵ� �ȿ��� Ŭ������ ���� �� �� �ִ�.
	class Gura{
		public void say() {
			System.out.println("�ȳ� ���� ����");
		}
	}
		Gura g1=new Gura();
		g1.say();
	}
}
