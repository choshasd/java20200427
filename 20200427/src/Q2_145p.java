/*
 * ���޵� ���� �Ҽ�(Prime Number)���� �ƴ����� �Ǵ��Ͽ� �Ҽ��� ��� true��, �ƴѰ�� false�� 
 * ��ȯ�ϴ� �޼ҵ带 �����ϰ�, �� �޼ҵ��� ȣ�� ����� ������� 1�̻� 100������ �Ҽ��� ���� 
 * ����ϴ� main �޼ҵ带 ��������
 * */
public class Q2_145p {
	public static void main(String[] args) {
		int num = 100;
		primeNum(num);
		
	}
	public static void primeNum(int a) {
		int i =2;
		boolean rePrime = true;
		
		while(i<=a) {
			rePrime = true;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					rePrime = false;
					break;
				}
			}
			if(rePrime == true) {
				System.out.println("�Ҽ� : "+i);
			}
			i++;
		}
	}
}
