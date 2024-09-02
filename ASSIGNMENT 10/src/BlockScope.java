public class BlockScope {
    public static void calculate() {
        int x = 10;
        System.out.println("Outside the loop: x = " + x);

        for (int i = 0; i < 5; i++) {
            int y = i * 5;
            System.out.println("Inside the loop: x = " + y);
        }
    }
    public static void main(String[] args) {
        calculate();
    }
}

