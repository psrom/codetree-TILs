import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        char[] word = new char[]{'L', 'E', 'B', 'R', 'O', 'S'};
        Scanner sc = new Scanner(System.in);

        char c = sc.next().charAt(0);
        int idx = -1;

        for (int i = 0; i < 6; i++) {
            if (c == word[i]) {
                idx = i;
                break;
            }
        }

        if (idx == -1) System.out.print("None");
        else System.out.print(idx);

    }
}