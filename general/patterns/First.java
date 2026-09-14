import java.util.*;
class First{
    private static void pattern1(int n){
       for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){
               System.out.print("*");
           }
           System.out.println(" ");
       }
    }

    private static void pattern2(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    private static void pattern3(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
public static void main(String[] args) {
        System.out.print("Enter the number of rows: ");
        Scanner sc=new Scanner(System.in);

        int n =sc.nextInt();
    pattern3(n);
}
}

