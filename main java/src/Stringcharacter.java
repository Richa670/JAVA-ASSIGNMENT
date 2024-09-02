public class Stringcharacter {
    public static void main(String[]args){
        String x="RICHA";
        int vowels=0, consonants=0;
        int p = p.toLowerCase();
        for(int i=0; i<p.length(); i++){
            char ch=p.charAt(i);
            if (Character.isLetter(ch)){
                if(isVowel(ch)) {
                    vowels++;
                }
                else{
                    consonants++;
                }
            }
        }
        System.out.print("Number of vowels:"+vowels);
        System.out.print("Number of consonants:"+consonants);
    }
}
