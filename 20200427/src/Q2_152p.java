import java.util.Scanner;

/*
 * 인자로 십진수 정수를 전달받아서 이에 해당하는 이진수 표현을 출력하는
 * 메소드를 재귀의 형태로 정의하고, 이를 호출하는 main 메소드를 정의해보자
 * */
public class Q2_152p {
	public static void main(String[] args) {
		
		Scanner deciScan = new Scanner(System.in);
		int deci = deciScan.nextInt();
		deciScan.close();
		deciToBinary(deci);
		
	}
	public static int deciToBinary(int deciNum) {
		if(deciNum > 0) {
            int resultDB = deciNum % 2;
            deciNum = deciNum / 2;
            
            deciToBinary(deciNum);
            System.out.println(resultDB);
        }
		return 0;
	}
}
