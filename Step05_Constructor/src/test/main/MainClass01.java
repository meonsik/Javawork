package test.main;

import test.mypac.Member;
import test.mypac.Student;
//new하는 시점에 heap영역에 객체가 생성됨.
public class MainClass01 {
	public static void main(String[] args) {
		Student s1=new Student();
		//Student클래스의 기본(default)생성자를 호출해서 객체를 생성한다는 의미..
			//heap영역에 필드와 매소드로 이루어진 객체가 생성된다는 뜻.
		//생성자 = Constructor
			//Class에 Constructor도 가능 field, method 뿐만아니라.
		Member m1=new Member(1, "김","노량진");
		Member m2=new Member(2, "해","행신동");
		new Student().study();//일회용 객체 stack에 저장되지 않음.
		new Student().study();
		
		
		s1.study();
		//Member의 생성자를 정의했기 때문에 기존의 방법으로는 new불가
		// new Member(); 로 작성할 수 없다.
	}
}
