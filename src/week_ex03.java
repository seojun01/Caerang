public class week_ex03 {
    public static void main(String [] args) {
        int[][] matrix1 = {{1,2}, {3,4}};
        int[][] matrix2 = {{5,6}, {7,8}};
        int[][] result = new int[2][2];

        for(int i = 0; i<matrix1.length; i++) {
            for(int j = 0; j<matrix1[0].length; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        for(int i = 0; i<result.length; i++) {
            for(int j = 0; j<result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
