import java.util.Scanner;
public class Hcf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a : ");
        int a = sc.nextInt();
        System.out.println("Enter b : ");
        int b = sc.nextInt();
        int hcf = hcf(a, b);
        System.out.println(hcf);
        System.out.println("LCM of " + a + " and " + b + " is : " + (a * b) / hcf);
    }

    public static int hcf(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
//The largest number that divides both (or all) given numbers exactly.

// Logic HCF (Euclidean Algorithm):
// Take two numbers a and b.
// While b is not 0:
//   Replace a with b.
//   Replace b with a % b (the remainder).
// When b becomes 0, a is the HCF.
//
// 👉 Example: HCF of 36 and 60
// 60 % 36 = 24 → new pair (36, 24)
// 36 % 24 = 12 → new pair (24, 12)
// 24 % 12 = 0 → stop → HCF = 12

// Logic for LCM:
//the smallest number that is a multiple of both (or all) given numbers

// Take two numbers a and b.
// First, find their HCF (using Euclidean Algorithm).
// Use the formula:
// LCM(a, b) = (a × b) / HCF(a, b)
//
// 👉 Example: LCM of 36 and 60
// HCF = 12
// Product = 36 × 60 = 2160
// LCM = 2160 ÷ 12 = 180
