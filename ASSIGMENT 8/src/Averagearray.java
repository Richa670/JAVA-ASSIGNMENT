import java.util.Scanner;

public class Averagearray {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int size= scanner.nextInt();
        int[] array =new int[size];
        System.out.println("enter"+ size + "elements");
        for(int i=0;i<size;i++) {
            array[i] = scanner.nextInt();
        }
        int sum =0;
        for (int num:array) {
            sum += num;
        }
        double average =(double)sum/size;
        System.out.println("the average of the array elements is:"+average);
        }
    }

