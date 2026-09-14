import java.util.Scanner;
// logic
//“Divisible by 4 is leap, except centuries — only leap if divisible by 400.”
public class Leap {
    public static void main(String[] args) {
        System.out.println("Enter a year: ");
        Scanner sc= new Scanner(System.in);
        int year=sc.nextInt();
         System.out.println(isLeapYear(year));
    }
    public static boolean isLeapYear(int year)
    {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}