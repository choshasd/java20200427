/*
 * 전달된 값이 소수(Prime Number)인지 아닌지를 판단하여 소수인 경우 true를, 아닌경우 false를 
 * 반환하는 메소드를 정의하고, 이 메소드의 호출 결과를 기반으로 1이상 100이하의 소수를 전부 
 * 출력하는 main 메소드를 정의하자
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
				System.out.println("소수 : "+i);
			}
			i++;
		}
	}
}
