import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tmp = 9;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (tmp == 0) {
                    tmp = 9;
                }
                System.out.print(tmp);
                tmp--;
            }
            System.out.println();
        }
    }
}