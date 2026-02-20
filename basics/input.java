import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();      // reads one word
        sc.nextLine();             // consume leftover newline

        String b = sc.nextLine();  // reads full line
        int c = sc.nextInt();      // integer
        double d = sc.nextDouble();// double

        System.out.println("a=" + a + ", b=" + b + ", c=" + c + ", d=" + d);

        
    }
}
