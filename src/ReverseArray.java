import java.util.Arrays;
public class ReverseArray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        for (int i = 0; i < arr.length / 2; i++) {

            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}


//public class ReverseArray {
//    public static void main(String[] args) {
//        int arr[]={12,34,87,65,45};
//        for(int i=arr.length-1;i>=0;i--){
//            int rev[]=new int[arr.length];
//            rev[i]=arr[i];
//
//
//
//
//        System.out.print(rev[i] +" ");
//}}}




//public class ReverseArray {
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5};
//        int[] revArr = new int[arr.length];
//        int j = 0;
//
//        for (int i = arr.length - 1; i >= 0; i--) {
//            revArr[j]=arr[i];
//            j++;
//        }
//        System.out.println(Arrays.toString(revArr));
//    }
//}


//public class ReverseArray {
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5};
//
//        for (int i = 0; i < (arr.length-1) / 2; i++) {
//            swap(arr, i, arr.length-1-i);
//        }
//
//        System.out.println(Arrays.toString(arr));
//    }
//    static void swap(int[] arr, int first, int second) {
//        int temp = arr[first];
//        arr[first] = arr[second];
//        arr[second] = temp;
//    }
//}


//public class ReverseArray {
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
//
//        for (int i = 0; i < (arr.length-1) / 2; i++) {
//            int temp = arr[i];
//            arr[i] = arr[arr.length-1-i];
//            arr[arr.length-1-i] = temp;
//        }
//
//        System.out.println(Arrays.toString(arr));
//    }
//}

//1 2 3 4 5 -> 5 4 3 2 1
//
//1st iteration 5 2 3 4 1
//2md iteration 5 4 3 2 1
//3rd iteration 5 4 3 2 1


// Two pointers




