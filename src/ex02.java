import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		System.out.print("월급을 입력하세요 : ");
		final int salary = sc.nextInt();
		
		System.out.println(name + "의 연봉은" + (salary*12) + "입니다.");
		sc.close();
	}

}
