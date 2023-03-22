import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");		//""안 내용 출력
		String name = sc.nextLine();				//name변수 안에 입력 받은 값 대입
		System.out.print("월급을 입력하세요 : ");		//""안 내용 출력
		final int salary = sc.nextInt();			//상수 salary변수 안에 입력 받은 값 대입
		
		System.out.println(name + "의 연봉은" + (salary*12) + "입니다.");		//name의 연봉은 salary*12 입니다 출력
		sc.close();		//스캐너 종료
	}

}
