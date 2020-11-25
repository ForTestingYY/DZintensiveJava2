import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[][] matrix = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = Integer.parseInt(reader.readLine());
            }
        }
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println("Сумма главной диагонали этой матрицы равна:");
        System.out.println(sum(matrix));
        }

    public static int sum(int[][] matr){
            return matr[0][0] + matr[1][1] + matr[2][2];
        }
/* TODO */

}