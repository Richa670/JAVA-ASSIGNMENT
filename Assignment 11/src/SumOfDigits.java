import java.util.Scanner;

public class SumOfDigits {
public static int sumOfDigits(int n) {
    if (n == 0) {
        return 0;
    } else {
        return (n % 10) + sumOfDigits(n / 10);
    }
}
public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter an integer:");
    int number= scanner.nextInt();
    int result = sumOfDigits(number);
    System.out.println("the sum of digits of" + number+ "is" +result);
}
}
