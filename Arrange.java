// Program to arrange a mixed case string such that uppercase letters are followed by lowercase letters, removing any other characters present in it.
import java.util.*;
class Arrange {
    Scanner sc = new Scanner(System.in);
    String s = "", y = ""; char ch = 0; int l;
    void input() {
        System.out.print("Enter the String:");
        s = sc.nextLine();
    }
    void arrange() {
        l = s.length();
        for(int i = 0; i < l; i++) {
            ch = s.charAt(i);
            if(Character.isLetter(ch) && Character.isLowerCase(ch)) {y = y + ch;}
        }
        for(int i = 0; i < l; i++) {
            ch = s.charAt(i);
            if(Character.isLetter(ch) && Character.isUpperCase(ch)) {y = y + ch;}
        }
        System.out.println("Filtered and Arranged String is:" + y);
    }
    public static void main(String[] args) {
        Arrange obj = new Arrange();
        obj.input(); obj.arrange();
    }
}
