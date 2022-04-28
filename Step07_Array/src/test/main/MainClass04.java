package test.main;

import test.mypac.Bike;

public class MainClass04 {
	public static void main(String[] args) {
		/*
		 * 1. Bike 객체를 담을 수 있는 방3개짜리 배열객체를 생성해서 참조값을 
		 * bikes라는 지역 변수에 담기.
		 * 2. 배열의 각 방에 Bike객체를 생성해서 담기.
		 * 3. 반복문 for를 이용해서 순서대로 배열의 각 방에있는 Bike 객체의
		 * ride()메소드 호출하기
		 */
		
		//Bike를 import하고
		//Bike배열을 만들고 bikes에 담자.
		Bike bike=new Bike();
//		Bike[] bikes= {new Bike()};
		Bike[] bikes=new Bike[3];
		for(int i=0; i<bikes.length; i++) {
			bikes[i]=bike;
			bikes[i].ride();
		}
	}
	
	
}
