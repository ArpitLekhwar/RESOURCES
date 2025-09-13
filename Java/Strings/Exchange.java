/*
Program to accept a sentence and interchange the first alphabet with the last 
alphabet for each word in the sentence, leaving the single letter words unchanged.
*/
import java.util.*;
class Exchange {
    Scanner sc = new Scanner(System.in);
    String s = "", w = "", rev = ""; int l = 0;
    void input() {
        System.out.print("Enter the String:");
        s = sc.nextLine();
    }
    void change() {
        StringTokenizer x = new StringTokenizer(s);
        l = x.countTokens();
        for(int i = 0; i < l; i++) {
            w = x.nextToken();
            int len = w.length();
            char f = w.charAt(0);
            char la = w.charAt(len - 1);
            if(len == 1) {rev = rev + f + " ";}
            else if(l == 2) {rev = rev + la + f + " ";}
            else {rev = rev + la + w.substring(1, len - 1) + f + " ";}
        }
        rev = rev.trim(); rev = rev + '.';
    }
    void display() {
        System.out.println("Original Sentence:" + s);
        System.out.println("Changed Sentence:" + rev);

    }
    public static void main(String[] args) {
        Exchange obj = new Exchange();
        obj.input(); obj.change(); obj.display();
    }
}