package test.mypac;
/*
 * T�� type �Ķ���� �̴�. Ÿ������ �Ű������� 
 * 
 * ���⿡ ���޵� Ŭ������ ���� Ŭ����(GenericClass)����Ѵ�.
 */


public class FruitBox<T> {
	
	//�ʵ� (type�� ������Ű�� �ʰ� ��Ȳ�� ���� �ٲ� �� ������?)
	private T item;
	public void setItem(T item) {
		this.item=item;
		
	}
	//�ʵ忡 ����� ���� �����ϴ� �޼ҵ�
	public T getItem() {
		return item;
	}
}
