import java.util.Scanner;

// Count the no of element greater than a number x
public class Question3 {
    public static void main(String[] args) {
        int z=0;
        int arr[]={12,23,43,65,32,17,34,29};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no to Compare for Greater one:");
        int x=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i]>x){
                z=z+1;

            }
        }
        System.out.println(z);
    }
}
