import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0;
        double score;

        for (int i = 0; i < n; i++) {
            score = sc.nextDouble();
            sum += score;
        }

        double average = sum / n;
        System.out.printf("%.1f", average);
        System.out.println();

        if (average >= 4.0) {
            System.out.print("Perfect");
        } else if (average >= 3.0) {
            System.out.print("Good");
        } else {
            System.out.print("Poor");
        }
    }
}