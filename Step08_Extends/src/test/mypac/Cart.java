package test.mypac;

public class Cart extends Wheels{
	public Cart() {
		System.out.println("���ڿ� ���� ������");
		
	}
	public void sit() {
		System.out.println(this.name+"�� �ɱ�");
	}
	public void drive() {
		System.out.println(this.name+"��(��) �ü� 10km�� ���� �� . . .");
	}

}
