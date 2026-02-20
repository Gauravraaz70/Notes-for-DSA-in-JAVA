// import java.util.Scanner;
// public class permutationandcombination {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter n value:");
//         int n=sc.nextInt();
//         int nfact=1;
//         for(int i=1;i<=n;i++){
//             nfact=(nfact*i);
//         }
//         System.out.print("Enter r value:");
//         int r=sc.nextInt();
//         int rfact=1;
//         for(int i=1;i<=r;i++){
//             rfact=(rfact*i);
//         }
        
//         int n_rfact=1;
//         for(int i=1;i<=n-r;i++){
//             n_rfact=(n_rfact*i);
//         }
//         int fact=nfact/((rfact*n_rfact));

//         System.out.println("Combination of "+ n+"c"+r + " is: " + fact);
//     }
// }



// by using function

import java.util.Scanner;
public class permutationandcombination {
    public static int fact(int x) {
        int xfaxt=1;
        for(int i=1;i<=x;i++){
            xfaxt=(xfaxt*i);
        }
        return xfaxt;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n value:");
        int n=sc.nextInt();
        System.out.print("Enter r value:");
        int r=sc.nextInt();
        int ncr=fact(n)/(fact(r)*fact(n-r));

        System.out.println("Combination of "+ n+"c"+r + " is: " + ncr);
    }
}


