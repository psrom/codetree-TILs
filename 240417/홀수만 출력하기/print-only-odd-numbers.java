import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int tmp = sc.nextInt();

            if ((tmp % 3 == 0) && (tmp % 2 == 1)) {
                System.out.println(tmp);
            }
        }
    }
}