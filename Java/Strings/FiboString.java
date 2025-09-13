import java.util.*;
class FiboString {
    Scanner sc = new Scanner(System.in);
    String s = "", x = "a", y = "b", z = "ba"; int n = 0;
    void accept() {
        System.out.print("Enter the number of terms required:");
        n = sc.nextInt();
    } 
    void generate() {
        System.out.print(x + ' ');
        System.out.print(y + ' ');
        for(int i = 1; i <= n - 2; i++) {
            System.out.print(z + ' ');
            x = y; y = z; z = y + x;
        }
    }
    public static void main(String[] args) {
        FiboString obj = new FiboString();
        obj.accept(); obj.generate();
    }    
}
