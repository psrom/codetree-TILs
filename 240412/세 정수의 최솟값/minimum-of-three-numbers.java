import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if (a >= b && b >= c) {
            System.out.println(c);
        } else if (a >= b && c >= b) {
            System.out.println(b);
        } else if (b >= a && a >= c) {
            System.out.println(c);
        } else if (b >= a && c >= a) {
            System.out.println(a);
        } else if (c >= a && a >= b) {
            System.out.println(b);
        } else {
            System.out.println(a);
        }
    }
}