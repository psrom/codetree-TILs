import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tmp1 = 1, tmp2 = n;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j % 2 == 0) {
                    System.out.print(tmp1);
                } else {
                    System.out.print(tmp2);
                }
            }
            tmp1++;
            tmp2--;
            System.out.println();
        }
    }
}