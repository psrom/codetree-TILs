import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        for (int i = 0; i < str1.length(); i++) {
            char a = str1.charAt(i);
            if (a != ' ') {
                System.out.print(a);
            }
        }

        for (int i = 0; i < str2.length(); i++) {
            char a = str2.charAt(i);
            if (a != ' ') {
                System.out.print(a);
            }
        }
    }
}