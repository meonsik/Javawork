package test.main;

import test.mypac.Remocon;

public class MainClass03 {
	
	static class YourRemocon implements Remocon{

		@Override
		public void up() {
			System.out.println("��¿Ƽ��");
		}

		@Override
		public void down() {
			System.out.println("��¿Ƽ��");			
		}
		
	}
	
	public static void main(String[] args) {
		Remocon r1=new YourRemocon();
		useRemocon(r1);
	}
	private static void useRemocon(Remocon r) {
		r.up();r.down();
	}
}
