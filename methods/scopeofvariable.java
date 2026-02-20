

public class scopeofvariable {
    static int x=10; // global variable for all 
    public static void main(String[] args) {
        System.out.println(x);
        int y=5; // local variable only fo this method 
        System.out.println(y);
    }
    //  System.out.println(x);  do not gives error  as x is global variable and can be accessed everywhere
    //  System.out.println(y);  gives error like y not defined as y is local to main method and can not be accessed outside main method
}
