import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();

        if (b < a) {
            int temp = b;
            b = a;
            a = temp;
        }

        int sumVal = 0;
        for (int i = a; i <= b; i++) {
            if (i % 5 == 0) {
                sumVal += i;
            }
        }
        System.out.print(sumVal);
    }
}