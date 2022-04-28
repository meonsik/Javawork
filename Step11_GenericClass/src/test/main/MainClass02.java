package test.main;

import test.mypac.Apple;
import test.mypac.Banana;
import test.mypac.FruitBox;
import test.mypac.Orange;

public class MainClass02 {
	public static void main(String[] args) {
		FruitBox<Apple> box1=new FruitBox<>(); //객체를 생성할 때 Generic 클래스는 생성가능
		FruitBox<Banana> box2=new FruitBox<>();//객체를 생성할 때 Generic 클래스는 생성가능
		FruitBox<Orange> box3=new FruitBox<>();//객체를 생성할 때 Generic 클래스는 생성가능
		
	}
}
