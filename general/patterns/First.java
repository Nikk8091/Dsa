package patterns;
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
    private static void pattern4(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    private static void pattern5(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(i+1);
            }
       System.out.println(" ");
        }
    }
    private static void pattern6(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
    }
//    butterfly pattern
    private static void pattern7(int n){
        for(int i=0;i<2*n-1;i++){
            for(int j=0;j<2*n;j++){
              if(((j<=i || j>=2*n-i-1) && i<n) || ((j<2*n-i-1 || j>i) && i>=n)){
                  System.out.print("* ");
              }else{
                  System.out.print("  ");
              }
            }
            System.out.println(" ");
        }
    }

public static void main(String[] args) {
        System.out.print("Enter the number of rows: ");
        Scanner sc=new Scanner(System.in);

        int n =sc.nextInt();
   pattern7(n);
}
}
