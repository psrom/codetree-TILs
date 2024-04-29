import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 65;

        for (int i = 0; i < n; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print("  ");
            }

            for (int j = n - i; j > 0; j--) {
                System.out.print((char)(c) + " ");
                if ((char)(c) == 'Z') {
                    c = 65;
                } else {
                    c++;
                }
            }
            System.out.println();
        }
    }
}