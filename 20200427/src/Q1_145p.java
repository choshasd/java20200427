import java.util.Scanner;

/*
 * ���ڷ� ���� ������ ������ �����ϸ�, ���� ���̸� ����ؼ� ��ȯ�ϴ� �޼ҵ��
 * ���� �ѷ��� ����ؼ� ��ȯ�ϴ� �޼ҵ带 ���� �����ϰ�, �̵��� ȣ���ϴ� main �޼ҵ� ����
 * */
public class Q1_145p {
	public static void main(String[] args) {
		System.out.println("���� �������� �Է��Ͻÿ�");
		Scanner scanRadius = new Scanner(System.in);
		int cRadius = scanRadius.nextInt();
		scanRadius.close();
		circleArea(cRadius);
		circleRound(cRadius);
	}
	public static void circleArea(int r) {
		double areaResult = Math.PI * (Math.pow(r, 2));
		System.out.println("���ǳ��� = "+areaResult);
	}
	public static void circleRound(int r) {
		double roundResult = 2 * Math.PI * r;
		System.out.println("���ǵѷ� = "+roundResult);
	}
}
