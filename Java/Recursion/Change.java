// Program to Change cases of letters in a word using Recursion.
import java.util.*;
class Change {
    Scanner sc = new Scanner(System.in);
    String s = "", x = ""; int len = 0;
    void input() {
        System.out.print("Enter the String:");
        s = sc.nextLine();
        len = s.length();
    }
    char caseConvert(char ch) {
        if(Character.isUpperCase(ch)) {
            ch = Character.toLowerCase(ch);
        }
        else if(Character.isLowerCase(ch)) {
            ch = Character.toUpperCase(ch);
        }
        return ch;
    }
    void recchange(int n) {
        if(n == len) {
            x = x + "";
        }
        else {
            char c = s.charAt(n);
            c = caseConvert(c);
            x = x + c;
            recchange(n + 1);
        }
    }
    void display() {
        System.out.println("Former Word:" + s);
        System.out.println("New Word:" + x);
    }
    public static void main(String[] args) {
        Change obj = new Change();
        obj.input(); obj.recchange(0); obj.display();
    }
}
