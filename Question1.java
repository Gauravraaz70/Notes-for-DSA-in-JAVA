// Given an array of marks of student if the marks of any student is less than 35 print its roll no ( index of array)
public class Question1 {
    public static void main(String[] args) {
        int arr[]={22,25,36,78,56,12};
        for(int i=0;i<arr.length;i++){
            if(arr[i]<35){
                System.out.print(i +" ");;
            }
            ;
        }
    }
}
