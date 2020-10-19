import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = -1;
        do {
            System.out.print("Height: ");
            height = sc.nextInt();
        }
        while (height >= 25 || height <= 0);
        System.out.println();

        for (int i = height; i > 0; i --) {
            for (int j = 0; j < i - 1; j++) {
                System.out.print(" ");
            }
            for (int h = height - i + 1; h >= 0; h--) {
                System.out.print("#");
            }
            System.out.println();
        }
        sc.close();
    }
}
