import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.next().length();
        int b = sc.next().length();
        int c = sc.next().length();

        int res = 0;
        int calc1 = Math.abs(a - b);
        if (calc1 > res) {
            res = calc1;
        }

        int calc2 = Math.abs(b - c);
        if (calc2 > res) {
            res = calc2;
        }

        int calc3 = Math.abs(c - a);
        if (calc3 > res) {
            res = calc3;
        }

        System.out.println(res);
    }
}