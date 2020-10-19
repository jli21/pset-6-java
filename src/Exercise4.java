import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = 0;
        int total = 0;
        int count = 0;
        do {
            System.out.print("Enter an integer: ");
            input = sc.nextInt();
            total += input;
            count += 1;
        }
        while (input >= 0);
        sc.close();
        total = total - input;
        count = count - 1;

        if (count == 0) {
            System.out.println("Error: division by zero.");
            System.exit(0);
        }
        double doubletotal = (double) total;
        double doublecount = (double) count;
        double average = doubletotal / doublecount;

        System.out.printf("%n%,.2f%n", average);
        sc.close();
    }
}