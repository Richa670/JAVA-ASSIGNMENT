import java.util.Scanner;

public class MatrixAddiction {
    public static void main(String[]args)
    {
        Scanner scanner=new Scanner(System.in);
        int[][] matrix1 = new int[2][2];
        int[][] matrix2 = new int[2][2];
        int[][] result= new int[2][2];
        System.out.println("enter the elements of the 1st matrix:");
        for (int i=0;i<2;i++) {
            for (int j = 0; j < 2; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }
        System.out.println("enter the elements of the 2nd matrix");
        for (int i=0;i<2;i++) {
            for (int j = 0; j < 2; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }
        for (int i=0;i<2;i++) {
            for (int j = 0; j < 2; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println("the resulting matrix after add is:");
        for (int i=0;i<2;i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(result[i][j] + "");
            }
            System.out.println();
            }
        }
    }
