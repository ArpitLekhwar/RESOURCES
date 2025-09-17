/*
Program to Check for a Happy Number. A Happy Number is a Number in which
the Eventual Sum of the Square of Digits of Number is Equal to 1.
*/
import java.util.*;
class Happy {
    Scanner sc = new Scanner(System.in);
    int n = 0, sum = 0;
    void input() {
        System.out.print("Enter the number:");
        n = sc.nextInt();
    }    
    int sum(int x) {
        if(x == 0) {return 0;}
        else {
            return ((x % 10) * (x % 10)) + sum(x / 10);
        }
    }
    void isHappy() {
        int s = sum(n);
        while (s > 9) {
            s = sum(n);
            n = s;
        }
        if(s == 1) {System.out.println("Number is a Happy Number");}
        else {System.out.println("Number is not a Happy Number");}
    }
    public static void main(String[] args) {
        Happy obj = new Happy();
        obj.input(); obj.isHappy();
    }
}
