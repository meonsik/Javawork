package test.main;

import java.util.ArrayList;

import test.mypac.Drill;
import test.mypac.MultiObject;
import test.mypac.Remocon;

public class MainClass04 {
	public static void main(String[] args) {
		Remocon r1=new Remocon() { //Remocon이 class면 Extends interface면 implements
			
			@Override
			public void up() {
				System.out.println("어쩔티비");
			}

			@Override
			public void down() {
				System.out.println("저쩔티비");			
			
			}
		};
		useRemocon(r1);
		
		//변수 선언도 귀찮다
		useRemocon(new Remocon() {
			
			@Override
			public void up() {
				System.out.println("ㅇㅉㅌㅂ");
			}
			
			@Override
			public void down() {
				System.out.println("ㅈㅉㅌㅂ");
			}
		});
		
		Drill m1=new MultiObject();
		//용도에 맞게 Drill Remocon을 골라쓰면 되겠다.
		//MultiObject로 받아도 되긴 되는데 다른 오브젝트의 메소드들이 보여서 귀찮아진다.
		
		
	}public static void useRemocon(Remocon r) {
		r.up();r.down();
	
	}
}
