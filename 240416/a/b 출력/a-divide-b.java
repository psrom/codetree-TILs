import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int integerPart = a / b;
        int remainder = a % b;

        System.out.print(integerPart + ".");

        for (int i = 0; i < 20; i++) {
            remainder *= 10;
            int digit = remainder / b;
            remainder %= b;
            System.out.print(digit);
        }
    }
}