import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;

        while (true) {
            if (n == 1) {
                System.out.print(x);
                break;
            }
            n /= 2;
            x++;
        }
    }
}