// import java.util.Scanner;
// public class multipatterns {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the number of rows:");
//         int n=sc.nextInt();
        
    
       
//         for (int i=1;i<=n;i++){ 
//                 for (int j=1;j<=n-i;j++){
//                         System.out.println(" ");}
//                 for(int j=1;j<=i;j++){
//                         System.out.println("*");


               
            
//             }
//              System.out.println();}}} 




//for       *
//         ***
//        *****
//       *******


import java.util.Scanner;
public class multipatterns {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int n=sc.nextInt();
        
    
       
        for (int i=1;i<=n;i++){ 
                for (int j=1;j<=n-i;j++){
                        System.out.println(" ");}
                for(int j=1;j<=i;j++){
                        System.out.println("*");


               
            
            }
             System.out.println();}}} 
    

