import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a1 = sc.next(), a2 = sc.next();
        int a1Length = a1.length(), a2Length = a2.length();

        if (a1Length == a2Length) {
            System.out.println("same");
        } else if (a1Length > a2Length) {
            System.out.printf("%s %d", a1, a1Length);
        } else {
            System.out.printf("%s %d", a2, a2Length);
        }
    }
}