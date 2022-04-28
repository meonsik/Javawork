package test.main;

import test.mypac.Calc;

public class MainClass08 {
	public static void main(String[] args) {
		//Calc 인터페이스를 람다식(한줄코딩)으로 구현하기
		Calc add=(a,b)->a+b;
		Calc sub=(a,b)->a-b;
		Calc mult=(a,b)->a*b;
		Calc divi=(a,b)->a/b;
		
		double result1=add.exec(1, 2);
		double result2=sub.exec(1, 2);
		double result3=mult.exec(11, 12);
		double result4=divi.exec(1, 3);
		
	}
}
