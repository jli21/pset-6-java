import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = -1;

        do {
            System.out.print("Enter an integer: ");
            input = sc.nextInt();
        }
        while (input <= 0);

        String value = Integer.toString(input);

        char[] array = value.toCharArray();
        System.out.println();
        for (int i = 0; i < array.length/2; i ++) {
            int temp = Character.getNumericValue(array[i]);
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = Character.forDigit(temp, 10);
            temp ++;
        }

        for (int k = 0; k < array.length - 1; k ++) {
            System.out.print(array[k] + ", ");
        }
        System.out.print(array[array.length - 1]);
        System.out.println(".");
        sc.close();

    }
}