import java.util.Scanner;

/*
 * 정수 둘을 인자로 전달받아서 두 수의 사칙연산 결과를 출력하는 메소드와
 * 이 메소드를 호출하는 main 메소드를 정의해 보자.
 * 단 나눗셈은 몫과 나머지를 각각 출력해야 한다.
 * */
public class Q1_142p {
	public static void main(String[] args) {
		int result;
		
		System.out.println("정수 둘을 입력하세요");
		Scanner scan_num1 = new Scanner(System.in);
		int num1 = scan_num1.nextInt();
		Scanner scan_num2 = new Scanner(System.in);
		int num2 = scan_num2.nextInt();
		scan_num1.close();
		scan_num2.close();
		result = sum(num1, num2);
		System.out.println(num1+"+"+num2+"="+result);
		result = sub(num1, num2);
		System.out.println(num1+"-"+num2+"="+result);
		result = mul(num1, num2);
		System.out.println(num1+"X"+num2+"="+result);
		result = divshare(num1, num2);
		System.out.println(num1+"/"+num2+"="+result);
		result = divremain(num1, num2);
		System.out.println(num1+"%"+num2+"="+result);
	}
		

	public static int sum(int a, int b) {
		int sumResult = a + b;
		return sumResult;
	}
	public static int sub(int a, int b) {
		int subResult = a - b;
		return subResult;
	}
	public static int mul(int a, int b) {
		int mulResult = a * b;
		return mulResult;
	}
	public static int divshare(int a, int b) {
		int divshareResult = a / b;
		return divshareResult;
	}
	public static int divremain(int a, int b) {
		int divremainResult = a % b;
		return divremainResult;
	}
}
