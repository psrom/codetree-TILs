import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int a = sc.nextInt(), b = sc.nextInt();

        while (a > 1) {
            int tmp = a / b;
            arr[a % b] += 1;
            a = tmp;
        }
        
        int res = 0;
        for (int i = 0; i < 10; i++) {
            int c = arr[i];
            res += c * c;
        }

        System.out.print(res);

    }
}