import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a1 = 1, a2 = n;
        System.out.printf("%d %d ", a1, a2);

        while (true) {
            if (a2 > 100) {
                break;
            }

            int temp = a2;
            a2 = a1 + a2;
            a1 = temp;
            System.out.printf("%d ", a2);

        }
    }
}