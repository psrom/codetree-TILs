import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[101];
        int i = 0, s = 0;

        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                s = arr[i - 1] + arr[i - 2] + arr[i - 3];
                System.out.print(s);
                break;
            } else {
                arr[i] = n;
                i++;
            }
        }
    }
}