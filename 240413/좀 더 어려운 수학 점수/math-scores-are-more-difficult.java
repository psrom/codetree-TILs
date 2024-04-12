import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aMath, aEng, bMath, bEng;
        aMath = sc.nextInt();
        aEng = sc.nextInt();
        bMath = sc.nextInt();
        bEng = sc.nextInt();

        if (aMath == bMath) {
            System.out.println(aEng > bEng ? "A": "B");
        } else if (aMath > bMath) {
            System.out.println("A");
        } else {
            System.out.println("B");
        }
    }
}