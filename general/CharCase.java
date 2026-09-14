import java.util.Scanner;
class CharCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch = sc.next().trim().charAt(0);
//        because all byte short char => to integer
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("The character is in lowercase");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("The character is in uppercase");
        } else {
            System.out.println("The character is not an alphabet");
        }
    }
}