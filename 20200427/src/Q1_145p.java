import java.util.Scanner;

/*
 * 인자로 원의 반지름 정보를 전달하면, 원의 넓이를 계산해서 반환하는 메소드와
 * 원의 둘레를 계산해서 반환하는 메소드를 각각 정의하고, 이둘을 호출하는 main 메소드 정의
 * */
public class Q1_145p {
	public static void main(String[] args) {
		System.out.println("원의 반지름을 입력하시오");
		Scanner scanRadius = new Scanner(System.in);
		int cRadius = scanRadius.nextInt();
		scanRadius.close();
		circleArea(cRadius);
		circleRound(cRadius);
	}
	public static void circleArea(int r) {
		double areaResult = Math.PI * (Math.pow(r, 2));
		System.out.println("원의넓이 = "+areaResult);
	}
	public static void circleRound(int r) {
		double roundResult = 2 * Math.PI * r;
		System.out.println("원의둘레 = "+roundResult);
	}
}
