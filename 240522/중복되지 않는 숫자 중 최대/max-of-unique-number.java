import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[1001];

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            arr[a] += 1;
        }

        int res = -1;
        for (int i = 1000; i > 0; i--) {
            if (arr[i] == 1) {
                res = i;
                break;
            }
        }

        System.out.println(res);
        
    }
}