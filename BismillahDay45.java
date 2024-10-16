public class operatorLogika {
    public static void main(String[] args) {
        
        boolean a = true;
        boolean b = false;

        boolean result = a && b;

        System.out.println("a AND b = " + result);

        a = true;
        b = true;
        result = a && b;
        System.out.println("a AND b = " + result);

        a = false;
        b = false;
        result = a && b;
        System.out.println("a AND b = " + result);
    }
}
