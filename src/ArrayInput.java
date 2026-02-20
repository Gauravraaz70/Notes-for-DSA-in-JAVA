import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter array size:");
        int n=sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter elements of array:");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));  //  To Print Array
        for(int i=0;i<n;i++) {
            System.out.print(arr[i] + " ");    // To Print output
        }
        }



    }

