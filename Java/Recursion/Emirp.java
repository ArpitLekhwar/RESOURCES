/*
Write a program to Check for Emirp Number Using Recursion.
Emirp Number is a Number which is prime backwards and forwards.
Example: 13
*/
import java.util.*;
class Emirp {
    Scanner sc = new Scanner(System.in);
    int n = 0, rev = 0, f = 2;
    void input() {
        System.out.print("Enter the number:");
        n = sc.nextInt();
    }
    int isPrime(int x) {
        if(x == n) {return 1;}
        else if(n == 1 || n % x == 0) {return 0;}
        return isPrime(x + 1);
    }
    void isEmirp() {
        int copy = n;
        while (copy > 0) {
            int d = copy % 10;
            rev = rev * 10 + d;
            copy = copy / 10;
        }
        int r1 = isPrime(f);
        n = rev;
        int r2 = isPrime(f);
        if(r1 == 1 && r2 == 1) {
            System.out.println("Emirp Number");
        }
        else {
            System.out.println("Not an Emirp Number");
        }
    }
    public static void main(String[] args) {
        Emirp obj = new Emirp();
        obj.input(); obj.isEmirp();
    }
}
