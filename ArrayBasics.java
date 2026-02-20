// datatype + array name + [] = new + datatype +[size of array];
// Example= int arr[]= new int[5];
// two declaration types (i) with new keywords --> int arr[]= new int[5];
//                        (ii) bilateral        --> int arr[] = {12, 13, 19, 18, 17};

import java.util.Arrays;

public class ArrayBasics {
    public static void main(String[] args) {
        int arr1[]={13,22,34,65};  // type A
        int arr[]= new int[3];     // type B
        System.out.println(arr.length); // print array length = 3
//        for(int num : arr){            // Enhanced for loop
//            System.out.print(num);
//        }
        arr[0]=22;
        arr[1]=14;
        arr[2]=25;
        System.out.println(arr1[3]);
        System.out.println(arr1[1]);
        System.out.println(arr1[0]+" "+arr1[1]+" "+arr1[2]);  // for type A
        System.out.println(arr[0]+" "+arr[1]+" "+arr[2]);     // for type B
        for(int i=0;i<=(arr1.length-1);i++){   // for full array to print in same line
            System.out.print(arr1[i]+" ");

        }
        System.out.println(Arrays.toString(arr1)); // To print Array [x,y,z]
    }

}

