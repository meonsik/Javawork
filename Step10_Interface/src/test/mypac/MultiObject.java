package test.mypac;

public class MultiObject implements Remocon,Drill{

	@Override
	public void up() {
		System.out.println("��¿Ƽ��~");
	}

	@Override
	public void down() {
		System.out.println("��¿Ƽ��~");
	}
	//Drill
	@Override
	public void hole() {
		System.out.println("���۶ձ�");
		
	}

}
