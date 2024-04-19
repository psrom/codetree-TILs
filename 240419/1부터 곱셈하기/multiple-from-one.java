import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), tmp = 1;

        for (int i = 1; i <= 10; i++) {
            tmp *= i;
            if (tmp >= n) {
                System.out.print(i);
                break;
            }
        }
    }
}