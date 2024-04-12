import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        
        // b가 항상 더 크다고 여김
        if (a > b){
            int temp = b;
            b = a;
            a = temp;
        }
        System.out.println(b - a);
    }
}