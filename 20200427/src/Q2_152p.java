import java.util.Scanner;

/*
 * ���ڷ� ������ ������ ���޹޾Ƽ� �̿� �ش��ϴ� ������ ǥ���� ����ϴ�
 * �޼ҵ带 ����� ���·� �����ϰ�, �̸� ȣ���ϴ� main �޼ҵ带 �����غ���
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
