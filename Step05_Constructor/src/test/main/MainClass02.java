package test.main;

import test.mypac.Cpu;
import test.mypac.HardDisk;
import test.mypac.MacBook;
import test.mypac.Market;
import test.mypac.Memory;

public class MainClass02 {
	public static void main(String[] args) {
		Cpu c=new Cpu();
		Memory m=new Memory();
		HardDisk h=new HardDisk();
		//이렇게 선언해두고 변수로 대입해도 됨.
		
		//1.MacBook객체를 생성해서 참조값을 mac1이라는 지역변수에 담기.
		MacBook mac1=new MacBook(new Cpu() ,new Memory(), new HardDisk());
			//Cpu Memory HardDisk타입의 객체를 불러올려면?
				//Cpu타입의 new Cpu()를 불러오기
				//Memory타입의 new Memory()불러오기
				//HardDisk타입의 new HardDisk()를 불러오기
			// Macbook(Cpu , Memory , HardDisk)
		MacBook mac2=new MacBook(c,m,h);
		MacBook mac3=new MacBook(Market.c,Market.m,Market.h);
		
		
		//2. mac1 지역변수에 들어 있는 참조값을 이용해서 .doGame() 메소드 호출
		mac1.doGame();
		mac2.doGame();
		mac3.doGame();
	}
}
