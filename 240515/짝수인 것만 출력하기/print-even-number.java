import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            
            if (a % 2 == 0) {
                arr[i] = a;
            }
        }

        for (int i = 0; i < n; i++) {
            int a = arr[i];
            if (a != 0) {
                System.out.print(a + " ");
            }
        }
    }
}