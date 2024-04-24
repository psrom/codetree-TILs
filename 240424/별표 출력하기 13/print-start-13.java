import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tmp1 = 1, tmp2 = n;

        for (int i = 0; i < n * 2; i++) {
            if (i % 2 == 0) {
                for (int j = tmp2; j > 0; j--) {
                    System.out.print("* ");
                }
                tmp2--;
            } else {
                for (int j = 0; j < tmp1; j++) {
                    System.out.print("* ");
                }
                tmp1++;
            }
            System.out.println();
        }
    }
}