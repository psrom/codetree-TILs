import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int res = 0;

        for (int i = start; i <= end; i++) {
            int tmp = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    tmp += j;
                }

                if (tmp > i) 
                break;
            }
            if (tmp == i) {
                res++;
            }
        }
        System.out.print(res);
    }
}