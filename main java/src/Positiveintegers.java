import java.util.Scanner;

public class Positiveintegers {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
    int sum =0;
    int num;
    while(true){
        System.out.print("enter an interger:");
        num = scanner.nextInt();

        if(num==0) {
            break;
        }
        if (num>0){
            sum=sum+num;
        }
        System.out.print("sum of +ve integers:"+ sum );

    }
    }
}
