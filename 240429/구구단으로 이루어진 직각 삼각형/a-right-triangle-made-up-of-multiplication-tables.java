import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tmp = n;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= tmp; j++) {
                System.out.printf("%d * %d = %d", i, j, i * j);
                
                if (j == tmp) {
                    System.out.println();
                } else {
                    System.out.print(" / ");
                }
            }
            tmp--;
        }
    }
}