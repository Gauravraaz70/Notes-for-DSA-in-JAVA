// import java.util.Scanner;
// public class sumofdigits {
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n= sc.nextInt();
//         int sum=0;
//         while (n/10>=0){
//             sum=(n%10)+sum;
//             n=n/10;
//             if(n==0){
//                 break;
//             }

//         }
        
//         System.out.println(sum);

//     }
    
// }


import java.util.Scanner;
public class sumofdigits {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= sc.nextInt();
        int sum=0;
        while (n!=0){
            int lastdigit=n%10;
            sum=sum+lastdigit;
            n/=10;   // n=n/10;
        }
        System.out.println(sum);
    }
        }