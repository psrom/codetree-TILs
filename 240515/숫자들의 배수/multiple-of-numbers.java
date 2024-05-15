import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int cnt = 0;

        while (cnt < 2) {
            int a = n * i;
            if (a % 5 == 0) {
                cnt += 1;
            }
            System.out.print(a + " ");
            i++;
        }
    }
}