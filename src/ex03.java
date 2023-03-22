import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		System.out.print("세 번째 정수를 입력하세요 : ");
		int num3 = sc.nextInt();
		
		System.out.println("출력 : ");
		System.out.println((num1+num2)%num3);
		System.out.println(((num1%num3)+(num2%num3))%num3);
		System.out.println((num1*num2)%num3);
		System.out.println(((num1%num3)*(num2%num3))%num3);
	}

}
