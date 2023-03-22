import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 자연수 A를 입력하세요 : ");
		int num1 = sc.nextInt();		
		System.out.print("두 번째 자연수 B를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		int sum = num1+num2;
		int min = num1-num2;
		int multiple = num1*num2;
		int divide = num1/num2;
		int nam = num1%num2;
		
		System.out.println("A + B = " + sum);
		System.out.println("A - B = " + min);
		System.out.println("A * B = " + multiple);
		System.out.println("A / B = " + divide);
		System.out.println("A % B = " + nam);

	}

}
