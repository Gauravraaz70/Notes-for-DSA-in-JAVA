// import java.util.Scanner;
// public class patterns {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the number of rows:");
//         int n=sc.nextInt();
//         System.out.print("Enter the number of columns:");
//         int m=sc.nextInt();
//         for (int i=1;i<=n;i++){
//             for (int j=1;j<=m;j++){
//                 System.out.print("* ");
//             }
//             System.out.println();// for net line
//         }


//     }
// }



// import java.util.Scanner;
// public class patterns {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the number of rows:");
//         int n=sc.nextInt();
       
//         for (int i=1;i<=n;i++){
            
//             for (int j=1;j<=n;j++){
//                 System.out.print(j);
//             }
//             System.out.println();// for net line
//         }


//     }
// }



// star with ascending order

// import java.util.Scanner;
// public class patterns {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the number of rows:");
//         int n=sc.nextInt();
       
//         for (int i=1;i<=n;i++){
//             int j=0;
//             while(j<i){
//                 j++;
//                 System.out.print("*");
//             }
//              System.out.println();
            
            
                
            
//         }
        
//     }

//     }
    

// ulta star

// import java.util.Scanner;
// public class patterns {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the number of rows:");
//         int n=sc.nextInt();
       
//         for (int i=n;i>=1;i--){
//             int j=0;
//             while(j<i){
//                 j++;
//                 System.out.print("*");
//             }
//              System.out.println();}}}



// 1
// 13
// 135

// import java.util.Scanner;
// public class patterns {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the number of rows:");
//         int n=sc.nextInt();
       
//         for (int i=1;i<=n;i++){
//             int j=0;
//             while(j<i){
//                 j++;
//                 System.out.print(j+1*j-1);
//             }
//              System.out.println();}}}/

// or

// import java.util.Scanner;
// public class patterns {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the number of rows:");
//         int n=sc.nextInt();
       
//         for (int i=1;i<=n;i++){
//             int j=0;
//             while(j<i){
//                 j++;
//                 System.out.print(2*j-1);
//             }
//              System.out.println();}}}


// for 1
//     23
//     456


// import java.util.Scanner;
// public class patterns {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the number of rows:");
//         int n=sc.nextInt();
//         int a=1;
       
//         for (int i=1;i<=n;i++){
//             for (int j=1;j<=i;j++){
//                 System.out.print(a);
//                 a++;
//             }
//              System.out.println();}}}


// for 1
//     01
//     101
//     0101

// import java.util.Scanner;
// public class patterns {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the number of rows:");
//         int n=sc.nextInt();
       
//         for (int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 if(i%2!=0 && j%2!=0 || i%2==0 && j%2==0){
//                     System.out.print(1);
//                 }
//                 else {
//                     System.out.print(0);
//                 }
//             }
//              System.out.println();}}}

//  or

// import java.util.Scanner;
// public class patterns {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the number of rows:");
//         int n=sc.nextInt();
       
//         for (int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 if((i+j)%2==0){
//                     System.out.print(1);
//                 }
//                 else {
//                     System.out.print(0);
//                 }
//             }
//              System.out.println();}}}

//    *    star plus
//   ***
//    *     

// import java.util.Scanner;
// public class patterns {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the number of rows:");
//         int n=sc.nextInt();
    
       
//         for (int i=1;i<=n;i++){
//             for(int j=1;j<=n;j++){  
//                 if(i== n/2+1 || j==n/2+1){
//                 System.out.print("*");}
//                 else {
//                     System.out.print(" ");
//                 }
                
            
//             }
//              System.out.println();}}}

// for howwow rectangle    * * *
//                         *   *
//                         * * *

 
// import java.util.Scanner;
// public class patterns {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the number of rows:");
//         int n=sc.nextInt();
//         System.out.print("Enter the number of rows:");
//         int m=sc.nextInt();
    
       
//         for (int i=1;i<=n;i++){
//             for(int j=1;j<=m;j++){  
//                 if(i==n || j==m ||i==1 || j==1 ){
//                 System.out.print(" *");}
//                 else {
//                     System.out.print("  ");
//                 }
                
            
//             }
//              System.out.println();}}}





// for         *     *
//                *
//             *     *

// import java.util.Scanner;
// public class patterns {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the number of rows:");
//         int n=sc.nextInt();
        
    
       
//         for (int i=1;i<=n;i++){
//             for(int j=1;j<=n;j++){  
//                 if(i==j  || i+j==(n+1)){
//                 System.out.print(" *");}
//                 else {
//                     System.out.print("  ");
//                 }
                
            
//             }
//              System.out.println();}}}





// for         *
//            **
//           ***
//          ****

import java.util.Scanner;
public class patterns {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int n=sc.nextInt();
        
    
       
        for (int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){  
                if( i+j<(n+1)){
                System.out.print(" ");}
                else {
                    System.out.print("*");
                }
                
            
            }
             System.out.println();}}}