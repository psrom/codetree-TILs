import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r, c;
        char a;

        while (true) {
            r = sc.nextInt();
            c = sc.nextInt();
            a = sc.next().charAt(0);

            System.out.println(r * c);
            if (a == 'C') {
                break;
            }
        }
    }
}