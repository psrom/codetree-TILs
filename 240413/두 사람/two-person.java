import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age1, age2;
        char gender1, gender2;
        age1 = sc.nextInt();
        gender1 = sc.next().charAt(0);
        age2 = sc.nextInt();
        gender2 = sc.next().charAt(0);

        if ((age1 >= 19 && gender1 == 'M') || (age2 >= 19 && gender2 == 'M')) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}