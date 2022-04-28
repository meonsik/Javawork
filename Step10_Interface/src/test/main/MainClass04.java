package test.main;

import java.util.ArrayList;

import test.mypac.Drill;
import test.mypac.MultiObject;
import test.mypac.Remocon;

public class MainClass04 {
	public static void main(String[] args) {
		Remocon r1=new Remocon() { //Remocon�� class�� Extends interface�� implements
			
			@Override
			public void up() {
				System.out.println("��¿Ƽ��");
			}

			@Override
			public void down() {
				System.out.println("��¿Ƽ��");			
			
			}
		};
		useRemocon(r1);
		
		//���� ���� ������
		useRemocon(new Remocon() {
			
			@Override
			public void up() {
				System.out.println("��������");
			}
			
			@Override
			public void down() {
				System.out.println("��������");
			}
		});
		
		Drill m1=new MultiObject();
		//�뵵�� �°� Drill Remocon�� ��󾲸� �ǰڴ�.
		//MultiObject�� �޾Ƶ� �Ǳ� �Ǵµ� �ٸ� ������Ʈ�� �޼ҵ���� ������ ����������.
		
		
	}public static void useRemocon(Remocon r) {
		r.up();r.down();
	
	}
}
