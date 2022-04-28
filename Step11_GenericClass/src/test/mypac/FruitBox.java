package test.mypac;
/*
 * T는 type 파라미터 이다. 타입조차 매개변수로 
 * 
 * 저기에 전달된 클래스를 포괄 클래스(GenericClass)라고한다.
 */


public class FruitBox<T> {
	
	//필드 (type을 고정시키지 않고 상황에 따라 바꿀 순 없을까?)
	private T item;
	public void setItem(T item) {
		this.item=item;
		
	}
	//필드에 저장된 값을 리턴하는 메소드
	public T getItem() {
		return item;
	}
}
