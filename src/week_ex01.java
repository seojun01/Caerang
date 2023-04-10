import java.util.Arrays;
public class week_ex01 {
    public static void main(String[] args) {
        int[] arr = {4,7,1,9,3};

        Arrays.sort(arr);

        int min = arr[arr.length-1];
        int max = arr[0];

        System.out.println("Minimum value : " + min);
        System.out.println("Maximum value : " + max);
    }
}