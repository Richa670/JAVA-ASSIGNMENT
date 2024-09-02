public class Largestcheck {
    public static void main(String[]args){
        int num1=12;
        int  num2=25;
        int  num3=52;
        if (num1>num2&&num1>num3) {
            System.out.println("the 1st number is greatest");
        } else if ( num2>num1&&num2>num3){
            System.out.println("the 2nd number is greatest");
        } else if ( num3>num1&&num3>num2){
            System.out.println("the 3rd number is greatest");
        }
    }
}
