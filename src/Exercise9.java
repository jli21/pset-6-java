import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = -1;
        do {
            System.out.print("Height: ");
            height = sc.nextInt();
        }
        while (height >= 25 || height <= 0);
        System.out.println();

        for (int k = height; k > 0; k--) {
            for (int m = 0; m < k-1; m++) {
                System.out.print(" ");
            }
            for (int h = height - k + 1; h >= 0; h--) {
                System.out.print("#");
            }
            System.out.print("  ");
            for (int h = height - k + 1; h >= 0; h--) {
                System.out.print("#");
            }
            System.out.println();
        }
        sc.close();
    }
}