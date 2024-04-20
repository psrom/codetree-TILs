import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean check = true;

        for (int i = 0; i < 5; i++) {
            int n = sc.nextInt();
            if (n % 3 != 0) {
                check = false;
                break;
            }
        }

        if (check == true) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }
        
    }
}