
// Logic of the Armstrong number:
// An Armstrong number (also called a narcissistic number) is a number
// that is equal to the sum of its own digits each raised to the power
// of the number of digits.
// For example, 153 is Armstrong because:
// 1^3 + 5^3 + 3^3 = 153

import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int num = sc.nextInt();
        System.out.println(isArmstrong(num));
    }

    public static boolean isArmstrong(int num) {
        int orginal = num;
        int digit = String.valueOf(num).length();
        int sum = 0;
        while (num > 0) {
            int n = num % 10;
          sum += Math.pow(n, digit);
            num = num / 10;
        }
        if (sum == orginal) {
            return true;
        } else {
            return false;
        }
    }
}