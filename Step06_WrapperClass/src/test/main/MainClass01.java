package test.main;
	/*
	 * [�⺻ data type�� ���� date type]
	 * 
	 * byte		: Byte
	 * short	: Short
	 * int		: Integer
	 * long		: Long
	 * 
	 * float	: Float
	 * double	: Double
	 * 
	 * char		: Character
	 * boolean	: Boolean
	 * 
	 * - �⺻������ type �� ���������� type�� �ʿ��� ���� �ִ�.
	 * 		�⺻ ������ type�� ��ü�� ����(boxing)�ϴ� ����.
	 * 		boxing unboxing �� �ڵ����� �̷������ ������ �Ű� �� �ʿ�� ����.
	 *
	 *	�⺻������ Ÿ���� �������� ���ϴ� ��ƿ��Ƽ�� ���.
	 *	��ü�� �����ؼ� �����ϱ�.
	 */

public class MainClass01 {
	public static void main(String[] args) {
		int num1=10;
		Integer num2=10; //Integer���� id���� ��.

		//���� ������ type������ �⺻ ������typeó�� ����� �� �ִ�.
		int result1=num2+1;
		int result2=num1+num2;
		Integer result3=num1+num2;
		
		//���ڸ� ���ڷ� �ٲٱ� 10 => "10" .toString();
		String strNum=num2.toString();
		//���ڸ� ���ڷ� �ٲٱ� .parseInt("");
		String strNum2="999";
		int result4=Integer.parseInt(strNum2);
		// �� Integer�� static �޼ҵ�
		
		
	}

}
