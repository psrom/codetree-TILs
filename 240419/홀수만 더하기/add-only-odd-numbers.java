import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sumVal = 0;

        for(int i = 0; i < n; i++) {
            int k = sc.nextInt();
            if ((k % 2 == 1) && (k % 3 == 0)) {
                sumVal += k;
            }
        }

        System.out.print(sumVal);
    }
}