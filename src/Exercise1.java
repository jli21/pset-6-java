import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lowerBound;
        int upperBound;
        int sum = 0;
        do {
            System.out.print("Lower bound: ");
            lowerBound = sc.nextInt();
            System.out.print("Upper bound: ");
            upperBound = sc.nextInt();
        }
        while (upperBound < lowerBound);

        for (int i = lowerBound; i <= upperBound; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.printf("%n%,d.%n", sum);
        sc.close();
    }
}