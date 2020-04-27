import java.util.Scanner;

/*
 * 인자로 정수 n을 전달받아서 2의 n승을 계산하여 반환하는 메소드를 재귀의 형태로
 * 정의하고, 이를 호출하는 main메소드를 정의해보자
 * */
public class Q1_152p {
	public static void main(String[] args) {
		double result = 0;
		System.out.println("제곱근 n을 입력하시오");
		Scanner squareNum = new Scanner(System.in);
		int num = squareNum.nextInt();
		squareNum.close();
		result = twoSquare(num);
		System.out.println("2의 "+num+"제곱 = "+(int)result);
	}
	public static double twoSquare(int sq) {
		double squareResult = Math.pow(2, sq);
		return squareResult ;
	}
}
