public class Leapyear {
    public static void main(String[] args) {
        int year = 2016;

        if (year % 400 == 0) {
            System.out.println(year + "is a leap year");
        } else if (year % 100 == 0) {
            System.out.println(year + "is a non-leap year");
        } else if (year % 4 == 0) {
            System.out.println(year + "is a leap year");
        } else {
            System.out.print(year + "is non-leap year");
        }
    }
}




