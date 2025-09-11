// Program to count vowel in each word from the string
import java.util.*;
class VowelCount {
    Scanner sc = new Scanner(System.in);
    String s = "", w = ""; int count = 0, l = 0, n = 0;
    void input() {
        System.out.print("Enter the number:");
        s = sc.nextLine();
    }
    void count() {
        StringTokenizer x = new StringTokenizer(s);
        int c = x.countTokens();
        String v = "AEIOUaeiou";
        for(int i = 1; i <= c; i++) {
            w = x.nextToken();
            l = w.length(); n = 0;d
            for(int j = 0; j < l; j++) {
                char ch = w.charAt(j);
                if(v.indexOf(ch) != -1) {n++;}
            }
            System.out.println(w + ":" + n);
        }
    }
    public static void main(String[] args) {
        VowelCount obj = new VowelCount();
        obj.input(); obj.count();
    }
}
