import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task {
    public static void main(String[] args) {
        /* TODO */;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n,m;
        while (true) {
            try {
                System.out.println("Задайте размер матрицы n на m");
                System.out.println("Введите n:");
                n = Integer.parseInt(reader.readLine());
                System.out.println("Введите m:");
                m = Integer.parseInt(reader.readLine());
                break;
            } catch (Exception e) {
                System.out.println("Введите целое число");
            }
        }
        int[][] matrix = new int[n][m];

        for (int i = 0; i< matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = (int)(0+Math.random()*100);
            }
        }

        for (int j = 0; j< matrix[0].length; j++) {
            for (int i = 0; i < matrix.length; i++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Максимальное число:");
        System.out.println(maxValue(matrix));
    }

    public static int maxValue(int [][] matrix) {
        int max = matrix[0][0];
        for (int i = 0; i< matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (max<matrix[i][j]) max = matrix[i][j];
            }
        }
     return max;
    }
}