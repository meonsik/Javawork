package test.mypac;

public class MacBook {
	//private�� �� class, ��ü�ȿ����� ��밡���ϴ�.
	//�ܺο��� ���� �Ұ���� ���� �����ڸ� private�� �ʵ� 3�� ����
	private Cpu cpu;
	private Memory memory;
	private HardDisk hardDisk;
	
	//������
	public MacBook(Cpu cpu,Memory memory,HardDisk hardDisk){
		//���������� �Ȱ��� �̸��̶� this �����Ұ�.
		this.cpu=cpu;
		this.memory=memory;
		this.hardDisk=hardDisk;
		
		
	}
	//�޼ҵ�
	public void doGame() {
		if(this.cpu==null||this.memory==null||this.hardDisk==null) {
			//������ ������� this ��������
			System.out.println("��ǰ�� �����ؼ� �ƺ� ���� �Ұ�.");
			return; //�޼ҵ带 ���⼭ ������.
		}
		System.out.println("�ų��� ������ �ؿ�!");
	}
}
