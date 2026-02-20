import java.util.Scanner;

public class multiplicationofdigits {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= sc.nextInt();
        int sum=1;
        while (n!=0){
            int lastdigit=n%10;
            sum=sum*lastdigit;
            n/=10;   // n=n/10;
        }
        System.out.println(sum);
    }
        }
    

