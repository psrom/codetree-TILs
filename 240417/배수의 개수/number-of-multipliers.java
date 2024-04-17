import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0, y = 0;
        for (int i = 0; i < 10; i++) {
            int n = sc.nextInt();

            if (n % 3 == 0) {
                x += 1;
            }

            if (n % 5 == 0) {
                y += 1;
            }
        } 
        System.out.printf("%d %d", x, y);
    }
}