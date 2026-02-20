//Print max value from an Array.

//public class MaximumAmongAll {
//    public static void main(String[] args) {
//        int arr[]={12,23,2,99,12,45,767,22,78};
//        int max=arr[0];
//        for(int i=0;i<arr.length  ;i++){
//            if(arr[i]>max){
//                max=arr[i];
//            }
//            }
//        System.out.println(max);
//            }
//        }


// print Second Maximum value from array


public class MaximumAmongAll {
    public static void main(String[] args) {
        int arr[]={12,23,2,99,12,45,767,22,78};
        int max=arr[0];
        for(int i=0;i<arr.length  ;i++){
            if(arr[i]>max) {
                max = arr[i];
            }
        }
        int max2=arr[0];
        for(int i=0;i<arr.length  ;i++) {
            if (arr[i] > max2 && arr[i] != max) {
                max2 = arr[i];}}
                System.out.print(max2);
            }
        }
