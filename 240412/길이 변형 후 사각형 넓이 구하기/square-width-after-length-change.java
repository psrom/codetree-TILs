import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r, c;
        r = sc.nextInt();
        c = sc.nextInt();

        r += 8;
        c *= 3;

        System.out.printf("%d\n%d\n%d", r, c, r * c);
    }
}