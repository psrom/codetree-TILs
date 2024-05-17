import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int j = 0; j < q; j++) {
            int num = sc.nextInt();

            if (num == 1) {
                int a = sc.nextInt();
                System.out.println(arr[a - 1]);
            } else if (num == 2) {
                int b = sc.nextInt();
                boolean check = false;
                for (int i = 0; i < n; i++) {
                    if (arr[i] == b) {
                        System.out.println(i + 1);
                        check = true;
                        break;
                    }
                }
                if (check == false) System.out.println(0);

            } else {
                int s = sc.nextInt();
                int e = sc.nextInt();

                for (int i = s - 1; i < e; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
        }
    }
}