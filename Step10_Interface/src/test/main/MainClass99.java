package test.main;

import test.mypac.GigaGenie;
import test.mypac.Remocon;

public class MainClass99 {
	
	public static class Tboy implements Remocon{

		@Override
		public void up() {
			System.out.println("��¿Ƽ����");
		}

		@Override
		public void down() {
			System.out.println("��¿Ƽ����");
		}

	}
	
	public static void main(String[] args) {
		//Ŭ������ �����ؼ� �� ��ü�� Remocon type ���ڷ� �����ϱ�.
		Remocon r1=new GigaGenie();
		useRemocon(r1);
		Remocon r2=new Tboy();
		useRemocon(r2);
		Remocon r3=new Remocon() {
			
			@Override
			public void up() {
				System.out.println("upup");
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void down() {
				System.out.println("downdown");				
			}
		};
		useRemocon(r3);
		useRemocon(new Remocon() {
			
			@Override
			public void up() {
				System.out.println("��¿�������̽�");
			}
			
			@Override
			public void down() {
				System.out.println("��¿�������̽�");
			}
		});
		
	}
	private static void useRemocon(Remocon r) {
		r.up();r.down();
	}
}
