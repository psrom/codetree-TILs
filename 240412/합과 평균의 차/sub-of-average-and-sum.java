import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        int m = a + b + c;

        System.out.println(m);
        System.out.println(m / 3);
        System.out.println(m - m / 3);
    }
}