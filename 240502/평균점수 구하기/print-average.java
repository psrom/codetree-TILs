import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double avg = 0;

        for (int i = 0; i < 8; i++) {
            avg += sc.nextDouble();
        }

        System.out.printf("%.1f", avg / 8);
        
    }
}