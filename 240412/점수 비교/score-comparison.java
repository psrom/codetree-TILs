import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int math_A, eng_A, math_B, eng_B;
        math_A = sc.nextInt();
        eng_A = sc.nextInt();
        math_B = sc.nextInt();
        eng_B = sc.nextInt();
        
        if (math_A > math_B && eng_A > eng_B) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

    }
}