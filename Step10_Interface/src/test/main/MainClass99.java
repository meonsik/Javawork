package test.main;

import test.mypac.GigaGenie;
import test.mypac.Remocon;

public class MainClass99 {
	
	public static class Tboy implements Remocon{

		@Override
		public void up() {
			System.out.println("어쩔티보이");
		}

		@Override
		public void down() {
			System.out.println("저쩔티보이");
		}

	}
	
	public static void main(String[] args) {
		//클래스를 생성해서 그 객체를 Remocon type 인자로 전달하기.
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
				System.out.println("어쩔인터페이스");
			}
			
			@Override
			public void down() {
				System.out.println("저쩔인터페이스");
			}
		});
		
	}
	private static void useRemocon(Remocon r) {
		r.up();r.down();
	}
}
