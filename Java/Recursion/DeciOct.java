// Program to Convert a Decimal Number to its Equivalent Octal Number using Recursion
import java.util.*;
class DeciOct {
    Scanner sc = new Scanner(System.in);
    int n = 0, oct = 0, x = 0;
    void input() {
        System.out.print("Enter the number:");
        n = sc.nextInt();
        x = n;
    }
    void deci_oct() {
        if(n == 0) {oct = 0;}
        else {
            int d = n % 8;
            n = n / 8;
            deci_oct();
            oct = oct * 10 + d;
        }
    }
    void show() {
        deci_oct();
        System.out.println("Decimal Number:" + x);
        System.out.println("Octal Number:" + oct);
    }
    public static void main(String[] args) {
        DeciOct obj = new DeciOct();
        obj.input(); obj.show();
    }
}