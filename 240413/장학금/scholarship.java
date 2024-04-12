import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int middle, fin;
        middle = sc.nextInt();
        fin = sc.nextInt();

        if (middle < 90) {
            System.out.println(0);
        } else if (fin >= 95) {
            System.out.println(100_000);
        } else if (fin >= 90) {
            System.out.println(50_000);
        } else {
            System.out.println(0);
        }
    }
}