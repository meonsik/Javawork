package test.main;

import test.mypac.Remocon;
import test.mypac.RemoteCon;

public class MainClass02 {
	public static void main(String[] args) {
		Remocon r=new RemoteCon(); //굳이 이렇게 써야하나? 이너클래스는 03에서 확인
		useRemocon(r);
		r.up();r.down();
	}
	public static void useRemocon(Remocon r) {
		
	}
}
