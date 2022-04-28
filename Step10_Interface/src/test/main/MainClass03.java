package test.main;

import test.mypac.Remocon;

public class MainClass03 {
	
	static class YourRemocon implements Remocon{

		@Override
		public void up() {
			System.out.println("¾îÂ¿Æ¼ºñ");
		}

		@Override
		public void down() {
			System.out.println("ÀúÂ¿Æ¼ºñ");			
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
