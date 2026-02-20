import java.util.Scanner;
public class square {
    public static void main(String[] args) {
        System.out.print("Enter the no to square: ");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b= a*a;
        System.out.println("Square is: " + b);
        
    }
    
}
