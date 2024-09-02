public class Reverse {
    public static void main(String[]args){
        int x = 156742;
        int b =0;
        while(x!=0)
        {
            int a = x % 10;
            b= (b* 10) + a;
            x = x/10;
        }
            System.out.println("the reverse of the num is:" + b);
        }
    }

