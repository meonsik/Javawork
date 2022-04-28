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
		//�̷��� �����صΰ� ������ �����ص� ��.
		
		//1.MacBook��ü�� �����ؼ� �������� mac1�̶�� ���������� ���.
		MacBook mac1=new MacBook(new Cpu() ,new Memory(), new HardDisk());
			//Cpu Memory HardDiskŸ���� ��ü�� �ҷ��÷���?
				//CpuŸ���� new Cpu()�� �ҷ�����
				//MemoryŸ���� new Memory()�ҷ�����
				//HardDiskŸ���� new HardDisk()�� �ҷ�����
			// Macbook(Cpu , Memory , HardDisk)
		MacBook mac2=new MacBook(c,m,h);
		MacBook mac3=new MacBook(Market.c,Market.m,Market.h);
		
		
		//2. mac1 ���������� ��� �ִ� �������� �̿��ؼ� .doGame() �޼ҵ� ȣ��
		mac1.doGame();
		mac2.doGame();
		mac3.doGame();
	}
}
