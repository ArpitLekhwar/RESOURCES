// Program to convert a string to lowercase, arrange it in alphabetical order and fill the missing letters between the first and last letter.
import java.util.*;
class ArrangeAndFill {
    Scanner sc = new Scanner(System.in);
    String s = "", x = ""; int l; char ch = 0;
    void input() {
        System.out.print("Enter the String:");
        s = sc.nextLine();
    }
    void arrange() {
        l = s.length();
        s = s.toLowerCase();
        for(int j = 97; j < 122; j++) {
            for(int i = 0; i < l; i++) {
                ch = s.charAt(i);
                if(ch == (char)(j)) {x = x + ch;}
            }
        }
        System.out.println("Sorted String:" + x);
    }
    void fill() {
        int a = (int)(x.charAt(0));
        int b = (int)(x.charAt(x.length() - 1));
        for(int i = a; i <= b; i++) {
            System.out.print((char)(i));
        }
    }
    public static void main(String[] args) {
        ArrangeAndFill obj = new ArrangeAndFill();
        obj.input(); obj.arrange(); obj.fill();
    }
}
