public class Product {
    public static void main(String[]args){
        int num=1;
        int i=1;

        while(i<=5){
            num *= i;
            i++;
        }
        System.out.print("product of num from 1 to 5:"+ num);
    }
}
