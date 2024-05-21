import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int MAX_INT = Integer.MAX_VALUE;
        final int MIN_INT = Integer.MIN_VALUE;
        int minVal = MAX_INT, maxVal = MIN_INT;

        while (true) {
            int n = sc.nextInt();
            if (n == 999 || n == -999) {
                break;
            }

            if (n > maxVal) {
                maxVal = n;
            }
            
            if (n < minVal) {
                minVal = n;
            }
        }
        System.out.printf("%d %d", maxVal, minVal);

    }
}