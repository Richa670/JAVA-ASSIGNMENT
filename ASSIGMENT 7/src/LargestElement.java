import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the  size of the array:");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

            int largest = array[0];
            for (int i = 1; i < size; i++) {
                if (array[i] > largest) {
                    largest = array[i];
                }
            }
            System.out.println("largest element int the array is" + largest);

        }
    }

