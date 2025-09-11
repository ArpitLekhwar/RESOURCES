//Write a program to enter a code in numeric form and convert the code into text using ASCII
//Eg: Code:-10665771011153266797868
//Decoded Text:- James Bond
import java.util.*;
class Decoder {
    Scanner sc = new Scanner(System.in);
    String s = "", s1 = "", s2 = "", s3 = "", s4 = "", s5 = "", s6 = "", w = "";
    long l1 = 0, l2 = 0; char ch = 0, ch1 = 0, ch2 = 0;
    int len = 0, lenw = 0, lenl = 0;
    void input() {
        System.out.print("Enter the code:");
        s = sc.nextLine();
        len = s.length();
    }
    void decode() {
        for(int i = 0; i < len; i++) {
            ch = s.charAt(i);
            if(Character.isDigit(ch) == false) {
                System.out.println("Letter found in the Code");
                System.exit(0);
            }
        }
        s1 = s;
        len = s.length();
        for(int i = 0; i < len; i = i + 2) {
            ch = s1.charAt(i);
            ch1 = s1.charAt(i + 1);
            s2 = s2 + ch + ch1;
            l1 = Long.parseLong(s2);
            l2 = l1;
            if(l1 >= 65 && l1 <= 90) {s3 = s3 + (char)(l2);}
            else if(l1 >= 97 && l1 <= 99) {s3 = s3 + (char)(l2);}
            else if(l1 == 32) {s3 = s3 + (char)(l2);}
            else {
                ch2 = s1.charAt(i + 2);
                s2 = s2 + ch2;
                l1 = Long.parseLong(s2);
                l2 = l1;
                if(l1 >= 100 && l1 <= 122) {s3 = s3 + (char)(l2);}
                i = i + 1;
            }s2 = "";
        }
        System.out.println(s3);
        StringTokenizer sb = new StringTokenizer(s3);
        lenw = sb.countTokens();
        for(int k = 1; k <= lenw; k++) {
            w = sb.nextToken();
            lenl = w.length();
            for(int j = 0; j< lenl; j++) {
                ch = w.charAt(j);
                if(j == 0 && Character.isLowerCase(ch)) {
                    ch = Character.toUpperCase(ch);
                    s4 = s4 + ch;
                }
                else if(j == 0 && Character.isUpperCase(ch)) {s4 = s4 + ch;}
                else if(Character.isUpperCase(ch)) {
                    ch = Character.toLowerCase(ch);
                    s4 = s4 + ch;
                }
                else {s4 = s4 + ch;}
                System.out.println(s4);
            }
            s5 = s5 + s4 + ' ';
            s6 = s6 + s5;
            s5 = ""; s4 = "";
        }
        s6 = s6.trim();
        System.out.println(s6);
    }
    public static void main(String[] args) {
        Decoder obj = new Decoder();
        obj.input();obj.decode();
    }
}
