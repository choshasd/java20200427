import java.util.Scanner;

/*
 * ���� ���� ���ڷ� ���޹޾Ƽ� , �� ���� '���� ���밪'�� ����Ͽ� ����ϴ� �޼ҵ�� 
 * �� �޼ҵ带 ȣ���ϴ� main �޼ҵ带 ������ ����.
 * ��, �޼ҵ� ȣ�� �� ���޵Ǵ� ���� ������ ������� ���밪�� ���ǰ� ��µǾ���Ѵ�.
 * */
public class Q2_142p {
	public static void main(String[] args) {
		Scanner scan_num1 = new Scanner(System.in);
		int num1 = scan_num1.nextInt();
		Scanner scan_num2 = new Scanner(System.in);
		int num2 = scan_num2.nextInt();
		
		scan_num1.close();
		scan_num2.close();
		int result;
		
		result = absolCal(num1, num2);
		System.out.println(num1+"-"+num2+"="+"["+result+"]");
		
	}
	public static int absolCal(int a, int b) {
		int resultAC = Math.abs(a-b);
		return resultAC;
	}
}
