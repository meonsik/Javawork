package test.main;

import test.mypac.Joinner;

public class MainClass07 {
	public static void main(String[] args) {
		Joinner jl=new Joinner() {
			
			@Override
			public String join(String one, String two) {
				return one+two;
			}	
		};
	
	Joinner j2=(one,two)->{
		return one+two;
	};
	
	Joinner j3=(one,two)->one+two;
	
	String result1=jl.join("kim","gura");
	String result2=j2.join("kim","gura");
	String result3=j3.join("kim","gura");
	
	boolean isEqual = result1==result2; //참조값 비교. 결과는 false. 문자열 비교는 참조값이 같을수도 있고 ,,
	boolean isEquals= result1.equals(result2) ; //문자열 비교 .equals()
	
	
	
	System.out.println(result1);
	System.out.println(result2);
	System.out.println(result3);
	
	System.out.println(isEqual);
	System.out.println(isEquals);
	
	};
	
	
}
