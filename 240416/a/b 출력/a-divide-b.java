import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), temp;
        int m = a / b;
        System.out.print(m + ".");

        if (m != 0) {
            temp = a * 10 / b;
            a = (a * 10) % b;
        }

        for (int i = 0; i < 20; i++) {
            temp = a * 10 / b;
            a = (a * 10) % b;
            System.out.print(temp);
        }
    }
}