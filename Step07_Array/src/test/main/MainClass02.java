package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		//0으로 초기화된 방 3개짜리 int[] 객체 만들어서 참조값을 지역 변수 nums에
		int[] nums= {0,0,0};
		nums[0]=10;
		nums[1]=20;
		nums[2]=30;
		//0으로 초기화된 방 3개짜리 int[] 객체 만들어서 참조값을 지역 변수 nums2에
			// new int[숫자]; 숫자만큼 방을 가진 int배열 생성. 
		int[] nums2=new int[3]; //0으로 초기화된 방 3개짜리
		nums2[0]=100;
		nums2[1]=200;
		nums2[2]=300;
		//nums[3]=400; 없는 방번호를 참조 시 Exception 발생
		
		System.out.println("종료");
		
		
		
		
		
		
		
		
	}
}
