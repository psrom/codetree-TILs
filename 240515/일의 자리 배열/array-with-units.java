import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt(), a2 = sc.nextInt();
        int[] arr = new int[10];

        arr[0] = a1;
        arr[1] = a2;

        for (int i = 2; i < 10; i++) {
            arr[i] = (arr[i - 2] + arr[i - 1]) % 10;
        }

        for (int i = 0; i < 10; i++) {
            System.out.printf("%d ", arr[i]);
        }
    }
}