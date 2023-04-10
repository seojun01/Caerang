import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int randomValue = (int)(Math.random()*100) + 1;
        int guessNumber = -1;
        int countNumber = 0;

        for(;;) {
            System.out.print("1부터 100까지의 정수를 입력하세요: ");
            guessNumber = sc.nextInt();
            countNumber++;

            if(guessNumber > randomValue) {
                System.out.println("더 작은 수를 입력하세요.");
            } else if(guessNumber < randomValue) {
                System.out.println("더 큰 수를 입력하세요.");
            } else {
                System.out.println("정답입니다!" + countNumber + " 번 만에 성공하였습니다.");
                break;
            }
        }
    }
}