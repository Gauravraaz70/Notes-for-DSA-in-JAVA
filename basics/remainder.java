import java.util.Scanner;
public class remainder {
    public static void main(String[] args) {
        System.out.print("enter first no: ");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        System.out.print("enter second no: ");
        int b=sc.nextInt();
        double c=a%b;
        System.out.print("Remainder is: " + c);
    }
    
}
