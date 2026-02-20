public class arithematic {
    public static void main(String[] args) {
        int a = 10, b=3;
        double c = 10.7;
        
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (c - a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));  //give greatest integer function
        System.out.println("Division:" + (c / a));   //give decimal value because c is in double
        System.out.println("Modulus: " + (a % b));
    }
}
