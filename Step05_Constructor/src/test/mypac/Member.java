package test.mypac;

public class Member {
	//field �Ķ���
	public int num;
	public String name;
	public String addr;
	

	//�ʵ忡 ������ ���� ���޹޴� ������
	public Member(int num, String name, String addr) {
		//�������� num,name,addr (local)
		this.num=num;
		this.name=name; 
		this.addr=addr;
	}
}


//�����ڸ� �� Ȱ���ؼ� ���ٿ� Member�� �ۼ��� �� ����
//javascript���� object �������� 
//let mem={num:1,name:"kim",addr:"home"} �̰�ó�� ����� �ʹ�!!!!