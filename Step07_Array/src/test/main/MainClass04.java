package test.main;

import test.mypac.Bike;

public class MainClass04 {
	public static void main(String[] args) {
		/*
		 * 1. Bike ��ü�� ���� �� �ִ� ��3��¥�� �迭��ü�� �����ؼ� �������� 
		 * bikes��� ���� ������ ���.
		 * 2. �迭�� �� �濡 Bike��ü�� �����ؼ� ���.
		 * 3. �ݺ��� for�� �̿��ؼ� ������� �迭�� �� �濡�ִ� Bike ��ü��
		 * ride()�޼ҵ� ȣ���ϱ�
		 */
		
		//Bike�� import�ϰ�
		//Bike�迭�� ����� bikes�� ����.
		Bike bike=new Bike();
//		Bike[] bikes= {new Bike()};
		Bike[] bikes=new Bike[3];
		for(int i=0; i<bikes.length; i++) {
			bikes[i]=bike;
			bikes[i].ride();
		}
	}
	
	
}
