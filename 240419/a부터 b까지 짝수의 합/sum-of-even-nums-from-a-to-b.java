import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int valSum = 0;

        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                valSum += i;
            }
        }
        System.out.print(valSum);
        
    }
}