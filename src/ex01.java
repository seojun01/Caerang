import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 자연수 A를 입력하세요 : ");	//""안 내용 출력
		int num1 = sc.nextInt();		// 정수형 변수 num1에 입력 받은 값 대입
		System.out.print("두 번째 자연수 B를 입력하세요 : ");		//"" 안 내용 출력
		int num2 = sc.nextInt();		// 정수형 변수 num2에 입력 받은 값 대입
		
		int sum = num1+num2;		// 정수형 변수 sum에 num1+num2 값 대입
		int min = num1-num2;		// 정수형 변수 min에 num1-num2 값 대입
		int multiple = num1*num2;		// 정수형 변수 multiple에 num1*num2 값 대입
		int divide = num1/num2;			// 정수형 변수 divide에 num1/num2 값 대입
		int nam = num1%num2;			// 정수형 변수 nam에 num1%num2 값 대입
		
		System.out.println("A + B = " + sum);		//A+B=sum값 출력
		System.out.println("A - B = " + min);		//A-B=min값 출력
		System.out.println("A * B = " + multiple);	//A*B=multiple값 출력
		System.out.println("A / B = " + divide);	//A/B=divide값 출력
		System.out.println("A % B = " + nam);		//A%B=nam값 출력

	}

}
