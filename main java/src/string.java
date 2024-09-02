public class string {
    public static void main(String[]args){
        String x = "RICHA";
        String R = "";
        for(int i = x.length()-1; i >=0; i-- ){
            R += x.charAt(i);
        }
        System.out.println("Revered :" +R);
    }
}
