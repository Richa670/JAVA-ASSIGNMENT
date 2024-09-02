import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[]args){
        Scanner scanner =new Scanner(System.in);
        int[][]matrix = new int[3][3];
        int[][]transpose = new int[3][3];

        System.out.println("enter the 3*3 elements:");
        for (int i=0;i<3;i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        for (int i=0;i<3;i++) {
            for (int j = 0; j < 3; j++) {
                transpose[i][j] = matrix[j][i];
            }
        }
        System.out.println("the transpose of the matrix:");
        for (int i=0;i<3;i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(transpose[i][j] + "");
            }
            System.out.println();
            }
            }
        }

