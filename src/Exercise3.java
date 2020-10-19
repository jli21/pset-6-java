import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = 0;
        int sum = 0;
        do {
            System.out.print("Enter an integer: ");
            input = sc.nextInt();
        }
        while (input <= 0);

        String number = Integer.toString(input);

        for (int i = 0; i < number.length(); i++) {

            int temp = Character.getNumericValue(number.charAt(i));
            if (temp % 2 == 1) {
                sum += temp;
            }

        }
        sc.close();
        System.out.println();
        System.out.println(sum + ".");
    }
}
