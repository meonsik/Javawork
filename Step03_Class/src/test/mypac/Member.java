package test.mypac;

public class Member {
	public int num;
	public String name;
	public String addr;
	// ����ϰ� ���� ������ 
	// Member m1 = new Member()
	//m1.num , m1.name, m1.addr �� ���� ��밡��.
	
//	�޼ҵ�
	public void showInfo() {
		//�ʵ忡 ����� ������ �Ʒ��� ���� �������� �ֿܼ� ����ϱ�
		//��ȣ:1, �̸�:�豸��, �ּ�:�뷮��
		System.out.println("��ȣ: "+this.num+",�̸�: "+this.name+", �ּ�: "+this.addr);
	}
}

