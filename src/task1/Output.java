package task1;

public class Output {
    public static void output(char[][]matrix, int n, int m){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i%2==0) {System.out.print(matrix[i][j]+" ");}
                else {System.out.print(" "+matrix[i][j]);}
            }
            System.out.println();
        }
    }
}
