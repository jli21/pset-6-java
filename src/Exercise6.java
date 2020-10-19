import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long temp1 = 0;
        long temp2 = 1;
        long current = 0;
        long input = 0;
        do {
            System.out.print("Enter an integer: ");
            input = sc.nextInt();
        }
        while (input < 0 || input > 92);

        for (int i = 0; i < input - 2; i ++) {
            current = temp1 + temp2;
            temp1 = temp2;
            temp2 = current;
        }

        System.out.printf("%n%,d.%n", current);
        sc.close();
    }
}
