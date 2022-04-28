package test.main;

public class MainClass03 {
	//String type을 담을 수 있는 방 3개짜리 빈 배열객체를 만들고
	//참조값을 지역변수 names에 담기
	
	public static void main(String[] args) {
		String[] names=new String[3];
		String[] names2={null,null,null};
		names[0]="김구라";
		names[1]="해골";
		names[2]="원숭이";
		
		for(int i=0; i<names.length; i++) {
			//i번째 String type객체를 참조해서
			String tmp=names[i];
			//출력하기
			System.out.println(tmp);
		}
	}
}
