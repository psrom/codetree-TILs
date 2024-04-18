import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int classroom = 0, passage = 0, toilet = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 12 == 0) {
                toilet += 1;
            } else if (i % 3 == 0) {
                passage += 1;
            } else if (i % 2 == 0) {
                classroom += 1;
            }
        }

        System.out.printf("%d %d %d", classroom, passage, toilet);
    }
}