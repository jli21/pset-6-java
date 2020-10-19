import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String response = "";
        int input = 0;
        do {
            System.out.print("Enter an integer: ");
            input = sc.nextInt();
        }
        while (input <= 0);

        for (int k = 1; k < Math.sqrt(input); k++) {
            if (input % k == 0) {
                response = response + Integer.toString(k) + ", " + Integer.toString(input/k) + ", ";
            }
        }

        response = response.substring(0, response.length() - 2);
        System.out.println();
        System.out.println(response + ".");
        sc.close();
    }
}