// Program to count and display frequency of each character in a string
import java.util.*;
class CharacterFrequency {
    Scanner sc = new Scanner(System.in);
    String s = ""; char ch = 0, ch1 = 0; int l = 0, f = 0;
    void input() {
        System.out.print("Enter the string:");
        s = sc.nextLine();
    }
    void count() {
        l = s.length();
        int k = 0;
        for(int i = 0; i < l; i++) {
            ch = s.charAt(i);
            for(k = 0; k < i; k++) {
                char p = s.charAt(k);
                if(ch == p) {break;}
            }
            if(k == i) {
                for(int j = i; j< l; j++) {
                    ch1 = s.charAt(j);
                    if(ch1 == ch) {f++;}
                }
                if(ch != ' ') {
                    System.out.println(ch + ":" + f);
                }
                f = 0;
            }
        }
    }
    public static void main(String[] args) {
        CharacterFrequency obj = new CharacterFrequency();
        obj.input(); obj.count();
    }
}
