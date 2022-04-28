package test.mypac;

public class MultiObject implements Remocon,Drill{

	@Override
	public void up() {
		System.out.println("¾îÂ¿Æ¼ºñ~");
	}

	@Override
	public void down() {
		System.out.println("ÀúÂ¿Æ¼ºñ~");
	}
	//Drill
	@Override
	public void hole() {
		System.out.println("±¸¸Û¶Õ±â");
		
	}

}
