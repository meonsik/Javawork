package test.main;

import test.mypac.Remocon;
import test.mypac.RemoteCon;

public class MainClass02 {
	public static void main(String[] args) {
		Remocon r=new RemoteCon(); //���� �̷��� ����ϳ�? �̳�Ŭ������ 03���� Ȯ��
		useRemocon(r);
		r.up();r.down();
	}
	public static void useRemocon(Remocon r) {
		
	}
}
