//public class SearchelementinArray {
//    public static void main(String[] args) {
//        int arr[]={22,35,45,78,14};
//        int target=78;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]==target){
//                System.out.println("Element found at index:"+i);
//            }
//        }
//    }
//}


import java.util.Scanner;

public class SearchelementinArray {
    public static void main(String[] args) {
        int arr[]={22,35,45,78,14};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Element to search:");
        int n=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                System.out.println("Element found at index:"+i);

            }


        }}}
