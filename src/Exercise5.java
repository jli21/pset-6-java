import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp = 0;
        int input = 0;
        do {
            System.out.print("Enter an integer: ");
            input = sc.nextInt();
        }
        while (input < 0);
        for (int i = 2; i < Math.sqrt(input); i++) {
            if (input % i == 0) {
                temp = i;
                break;
            }
        }
        
        if (temp != 0) {
            System.out.println("Not prime.");
        }
        else {
            System.out.println("Prime.");
        }
        sc.close();
    }
}