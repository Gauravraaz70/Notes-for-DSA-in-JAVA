// import java.util.Scanner;
// public class swaptwonumbers {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter first number:");
//         int a=sc.nextInt();
//         System.out.print("Enter second number:");
//         int b=sc.nextInt();
//         int c=a;
//         a=b;
//         b=c;
//         System.out.println(a+" "+b);

//     }
    
// }


// or 


import java.util.Scanner;
public class swaptwonumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number:");
        int a=sc.nextInt();
        System.out.print("Enter second number:"); 
        int b=sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+" "+b);

    }
    
}
