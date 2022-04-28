package test.main;
/* 자바스크립트의 배열보다 활용도가 떨어짐.
 * 		javascript let arr=[]; 
 * 		java ={}
 * 		배열도 객체
 *		즉 배열도 참조데이터 type이다.
 * 			java에서는 배열이 결정되면 사이즈를 변경할 수 없다. 고정배열
 * 			배열을 추가하거나 줄일 수 없음*********
 * 
 */		
 
public class MainClass01 {
	public static void main(String[] args) {
		// int type 5개
		int[] nums={10,20,30,40,50};
		// double type 5개
		double[] nums2= {10.1,11.2,12.3,13.4,15.6};
		// boolean type 5개
		boolean[] truth= {true,true,false,false,false};
		// String type 5개
		String[] names= {"김","해","원","주","덩"};
		
//클래스명이 아닌 참조데이터타입.
// nums.clone() //배열복제
// nums.length //배열 길이, 방의 크기
		//배열의 각각의 방 참조하기
		int result1=nums[0]; //10
		double result2=nums2[1]; //10.2
		boolean result3=truth[2]; //false
		String result4=names[3]; // "주뎅이"
		
		//배열 객체의 메소드 사용
		int [] cloned=nums.clone();
		int size=nums.length;
		
	}
}
