package test.main;

import test.mypac.Car;
import test.mypac.MyObject;
import test.mypac.Radio;
import test.mypac.Speaker;

public class MainClass01 {
	public static void main(String[] args) {
		//MyObjectŬ������ ���ǵ� 3���� �޼ҵ带 ���ʷ� ȣ���ϴ� code�ۼ�
		MyObject mo=new MyObject();
		
		mo.walk();
		mo.getNumber();
		mo.getGreeting();
		//��Ƽ� ����ϰ� ������
		int num=mo.getNumber();
		String greet=mo.getGreeting();
		//Car type��ü�� �ҷ����� �޼ҵ�
		Car car=mo.getCar();
		car.name="�ҳ�Ÿ";
		
		//.setNum() .setName() .useCar() �޼ҵ带 3�� ȣ���ϴ� code
			//���ڸ� ���� �����ڷ� ���� �����ϴ� ������ ������ ��
		mo.setNum(1); //1�� �����Ѵ� int num=1;
		mo.setName("�̸�"); // String name="�̸�";
		mo.useCar(car); // Car car = new Car();
		
		//.listenMusic() �޼ҵ带 ȣ���ϴ� code �ۼ��ϱ�.
			//ù��° ���ڴ� Radio type, �ι�° ���ڴ� Speaker type
		mo.listenMusic(new Radio(), new Speaker());
		
		
	}
}
