import java.util.Scanner;

/*
 * ���ڷ� ���� n�� ���޹޾Ƽ� 2�� n���� ����Ͽ� ��ȯ�ϴ� �޼ҵ带 ����� ���·�
 * �����ϰ�, �̸� ȣ���ϴ� main�޼ҵ带 �����غ���
 * */
public class Q1_152p {
	public static void main(String[] args) {
		double result = 0;
		System.out.println("������ n�� �Է��Ͻÿ�");
		Scanner squareNum = new Scanner(System.in);
		int num = squareNum.nextInt();
		squareNum.close();
		result = twoSquare(num);
		System.out.println("2�� "+num+"���� = "+(int)result);
	}
	public static double twoSquare(int sq) {
		double squareResult = Math.pow(2, sq);
		return squareResult ;
	}
}
