package task1;

public class Program {
    public static void main(String[] args) {
        int n = Input.inputData();
        int m = Input.inputData();
        char [][]matrix = new char[n][m];
        matrixInitalization(matrix,n,m);
        Output.output(matrix,n,m);

    }
    public static char[][] matrixInitalization(char[][]matrix,int n, int m){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j]='*';
            }
        }
        return matrix;
    }
}
