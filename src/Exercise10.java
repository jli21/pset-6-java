import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter credit card number: ");
        long given = sc.nextLong();
        String number = Long.toString(given);
        int length = number.length();
        int temp1  = 0;
        int temp2 = 0;
        int totalSum = 0;
        System.out.println();
        for (int k = length-2; k >= 0; k -=2) {
            char value = number.charAt(k);
            int intValue = Character.getNumericValue(value) * 2;
            if (intValue >= 10) {
                int tens = (int) intValue/10;
                int ones = intValue % 10;
                temp1 = temp1 + tens + ones;
            }
            else {
                temp1 = temp1 + intValue;
            }
        }
        for (int m = length -1; m >= 0; m -=2) {
            char value = number.charAt(m);
            int intValue = Character.getNumericValue(value);
            temp2 = temp2 + intValue;
        }
        totalSum = temp1 + temp2;
        if (totalSum % 10 == 0) {
            if (((number.substring(0,2).equals("34")) || (number.substring(0,2).equals("37"))) && (length == 15)) {
                System.out.println("American Express.");
            }
            else if (((number.substring(0,2).equals("51")) || (number.substring(0,2).equals("52")) || (number.substring(0,2).equals("53")) || (number.substring(0,2).equals("54")) || (number.substring(0,2).equals("55"))) && (length == 16)) {
                System.out.println("Mastercard.");
            }
            else if ((number.substring(0,1).equals("4")) && ((length == 13) || (length == 16))) {
                System.out.println("Visa.");
            }
            else {
                System.out.println("Invalid.");
            }
        }
        else {
            System.out.println("Invalid.");
        }
        sc.close();
        
    }
}