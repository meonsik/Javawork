package test.main;

import test.mypac.Member;
import test.mypac.Student;
//new�ϴ� ������ heap������ ��ü�� ������.
public class MainClass01 {
	public static void main(String[] args) {
		Student s1=new Student();
		//StudentŬ������ �⺻(default)�����ڸ� ȣ���ؼ� ��ü�� �����Ѵٴ� �ǹ�..
			//heap������ �ʵ�� �żҵ�� �̷���� ��ü�� �����ȴٴ� ��.
		//������ = Constructor
			//Class�� Constructor�� ���� field, method �Ӹ��ƴ϶�.
		Member m1=new Member(1, "��","�뷮��");
		Member m2=new Member(2, "��","��ŵ�");
		new Student().study();//��ȸ�� ��ü stack�� ������� ����.
		new Student().study();
		
		
		s1.study();
		//Member�� �����ڸ� �����߱� ������ ������ ������δ� new�Ұ�
		// new Member(); �� �ۼ��� �� ����.
	}
}
