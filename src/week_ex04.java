public class week_ex04 {
    public static void main(String[] args) {
        int[] arr = {5,2,8,1,3};

        System.out.print("정렬 전 배열 : ");
        for(int i = 0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        int n = arr.length;

        for(int i = n-1; i>0; i--) {
            for(int j = 0; j<i; j++) {
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.print("\n정렬 후 배열 : ");
        for(int i = 0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}