// Calculate the sum of all elements in array
//public class Question2 {
//    public static void main(String[] args) {
//        int arr[]={12,22,54,67,55};
//        int sum = 0;
//        for(int i=0;i<arr.length;i++){
//            sum=arr[i]+sum;
//
//            }
//        System.out.print(sum);
//
//
//
//
//    }
//}


import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Size of Array: ");
        int n = sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter elements of array:");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
            sum=arr[i]+sum;

        }
        System.out.print(sum);
    }}
