import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0, valSum = 0;
        for (int i = 0; i < 10; i++) {
            int n = sc.nextInt();
            
            if (0 <= n && n <= 200) {
                cnt++;
                valSum += n;
            }
        }

        System.out.printf("%d %.1f", valSum, (float)valSum / cnt);
    }
}