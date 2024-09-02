public class VariableScope {
    public static int sum(int a, int b) {
        return a + b;
    }
    public static int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[]args){
        int result = sum( 3, 6);
        System.out.println("Sum: " + result);

        int product = multiply(4, 8);
        System.out.println("Product: " + product);
    }
}
