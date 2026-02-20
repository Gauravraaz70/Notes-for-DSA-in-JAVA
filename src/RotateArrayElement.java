import java.util.Arrays;
//import java.util.Scanner;
//
//public class RotateArrayElement {
//    public static void main(String[] args) {
//        int arr[]={2,3,5,7,11,13,17};
//        Scanner sc= new Scanner(System.in);
//        System.out.print("Enter no of steps to Rotate:");
//        int k=sc.nextInt();
//        for(int i=k;i<arr.length;i++){
//            System.out.print(arr[i]+" ");}
//            for(int j=0;j<k;j++){
//            System.out.print(arr[j]+" ");
//        }
//        System.out.println(Arrays.toString(arr));
//    }}


//import java.util.Arrays;
//import java.util.Scanner;
//
//public class RotateArrayElement {
//    public static void main(String[] args) {
//
//        int[] arr = {2,3,5,7,11,13,17};
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter no of steps to Rotate: ");
//        int k = sc.nextInt();
//
//        k = k % arr.length;   // To prevent extra rotation
//
//        for(int step = 0; step < k; step++) {
//
//            int first = arr[0];   // store first element
//
//            for(int i = 0; i < arr.length - 1; i++) {
//                arr[i] = arr[i + 1];   // shift left
//            }
//
//            arr[arr.length - 1] = first;   // put first at end
//        }
//
//        System.out.println(Arrays.toString(arr));
//    }
//}


import java.util.Arrays;
import java.util.Scanner;

public class RotateArrayElement {
    public static void main(String[] args) {

        int[] arr = {2, 3, 5, 7, 11, 13, 17};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of steps to Rotate: ");
        int k = sc.nextInt();

        k = k % arr.length; // To prevent extra rotation and array out of bound
        // Step 1: Reverse first k elements
        int i = 0;
        int j = k - 1;
        while(i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        // Step 2: Reverse remaining elements
        i = k;
        j = arr.length - 1;
        while(i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        // Step 3: Reverse whole array
        i = 0;
        j = arr.length - 1;
        while(i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        System.out.println(Arrays.toString(arr));
    }
}