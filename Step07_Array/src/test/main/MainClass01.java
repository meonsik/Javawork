package test.main;
/* �ڹٽ�ũ��Ʈ�� �迭���� Ȱ�뵵�� ������.
 * 		javascript let arr=[]; 
 * 		java ={}
 * 		�迭�� ��ü
 *		�� �迭�� ���������� type�̴�.
 * 			java������ �迭�� �����Ǹ� ����� ������ �� ����. �����迭
 * 			�迭�� �߰��ϰų� ���� �� ����*********
 * 
 */		
 
public class MainClass01 {
	public static void main(String[] args) {
		// int type 5��
		int[] nums={10,20,30,40,50};
		// double type 5��
		double[] nums2= {10.1,11.2,12.3,13.4,15.6};
		// boolean type 5��
		boolean[] truth= {true,true,false,false,false};
		// String type 5��
		String[] names= {"��","��","��","��","��"};
		
//Ŭ�������� �ƴ� ����������Ÿ��.
// nums.clone() //�迭����
// nums.length //�迭 ����, ���� ũ��
		//�迭�� ������ �� �����ϱ�
		int result1=nums[0]; //10
		double result2=nums2[1]; //10.2
		boolean result3=truth[2]; //false
		String result4=names[3]; // "�ֵ���"
		
		//�迭 ��ü�� �޼ҵ� ���
		int [] cloned=nums.clone();
		int size=nums.length;
		
	}
}
