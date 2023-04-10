import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("줄의 수 입력: ");
        int inputValue = sc.nextInt();
        int res = 1;

        for(int i = 1; i<=inputValue; ++i) {
            for(int j = 1; j<=i; ++j) {
                System.out.print(res + " ");
                ++res;
            }
            System.out.println();
        }
    }
}