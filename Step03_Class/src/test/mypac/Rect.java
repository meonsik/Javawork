package test.mypac;

public class Rect {

	public int width;
	public int height;
	public void showArea() {//void�� �����մϴ� (���Ͼ���)
		System.out.println("���̴�: "+this.width*this.height);
	}
	//������ ȣ���� ������ �����ϴ� �޼ҵ�
	public int getArea() { //int�� �����մϴ�
		int area=width*height;
		return area;
	}
	
}


