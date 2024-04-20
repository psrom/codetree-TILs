import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, cnt = 0, sumVal = 0;

        while (true) {
            n = sc.nextInt();
            if (20 <= n && n < 30) {
                cnt++;
                sumVal += n;
                continue;
            }
            System.out.printf("%.2f", (double)sumVal / cnt);
            break;
        }
        
    }
}