import java.util.Scanner;

/*
 * 정수 둘을 인자로 전달받아서 , 두 수의 '차의 절대값'을 계산하여 출력하는 메소드와 
 * 이 메소드를 호출하는 main 메소드를 정의해 보자.
 * 단, 메소드 호출 시 전달되는 값의 순서에 상관없이 절대값이 계산되고 출력되어야한다.
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
