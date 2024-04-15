import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt(), a = sc.nextInt(), i;

        if (b % 2 == 0) {
            b -= 1;
        }

        for (i = b; i >= a; i -= 2) {
            System.out.print(i + " ");
        }

    }
}