import javax.print.DocFlavor;

public class Clculator {
    public static void main(String[]args){
        int num1=55;
        int num2=47;
        double result;
        char operator = '*';

        switch (operator){
            case '+':
                result = num1 + num2;
                System.out.println("Result is:" + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result is:" + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result is:" + result);
                break;
            case '/':
                result = num1 / num2;
                System.out.println("Result is:" + result);
                break;
        }
    }
}
