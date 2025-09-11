import java.util.*;
class UpperLower {
    Scanner sc = new Scanner(System.in);
    String s = ""; char ch = 0; int i = 0, maxl = 0, maxu = 0, minl = 97, minu = 65;
    void input() {
        System.out.print("Enter the String:");
        s = sc.nextLine();
    }
    void display() {
        int l = s.length();
        for(int j = 0; j < l; j++) {
            ch = s.charAt(j);
            i = (int)(ch);
            if(i >= 97 && i <=122) {
                if(i > maxl) {maxl = i;}
                else if (i < minl) {minl = i;}
            }
            else if( i >= 65 && i <= 90) {
                if(i > maxu) {maxu = i;}
                else if(i < minu) {minu = i;}
            }
        }
        System.out.println("Lowest Lowercase:" + (char)(minl));
        System.out.println("Greatest Lowercase:" + (char)(maxl));
        System.out.println("Lowest Uppercase:" + (char)(minu));
        System.out.println("Greatest Uppercase:" + (char)(maxu));
    }
    public static void main(String[] args) {
        UpperLower obj = new UpperLower();
        obj.input(); obj.display();
    }
}
