import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char cold1, cold2, cold3;
        int temp1, temp2, temp3;

        cold1 = sc.next().charAt(0);
        temp1 = sc.nextInt();
        cold2 = sc.next().charAt(0);
        temp2 = sc.nextInt();
        cold3 = sc.next().charAt(0);
        temp3 = sc.nextInt();

        int check = 0;
        if (temp1 >= 37 && cold1 == 'Y') {
            check++;
        }
        if (temp2 >= 37 && cold2 == 'Y') {
            check++;
        }
        if (temp3 >= 37 && cold3 == 'Y') {
            check++;
        }

        if (check >= 2){
            System.out.println("E");
        } else {
            System.out.println("N");
        }

        
    }
}