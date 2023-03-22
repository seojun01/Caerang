import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수를 입력하세요 : ");			//""안 내용 출력
		int num1 = sc.nextInt();							//정수형 변수 num1에 입력 받은 값 대입
		System.out.print("두 번째 정수를 입력하세요 : ");			//""안 내용 출력
		int num2 = sc.nextInt();							//정수형 변수 num2에 입력 받은 값 대입
		System.out.print("세 번째 정수를 입력하세요 : ");			//""안 내용 출력
		int num3 = sc.nextInt();							//정수형 변수 num3에 입력 받은 값 대입
		
		System.out.println("출력 : ");						//""안에 내용 출력
		System.out.println((num1+num2)%num3);				//계산한 값 출력
		System.out.println(((num1%num3)+(num2%num3))%num3); //위와 동일
		System.out.println((num1*num2)%num3);				//위와 동일
		System.out.println(((num1%num3)*(num2%num3))%num3); //위와 동일
	}

}
