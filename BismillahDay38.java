public class OperatorPenugasan {
    public static void main(String[] args) {
        int a = 10; 
        int b = 5;  

        System.out.println("Nilai awal:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a *= b; 
        System.out.println("Setelah perkalian (a *= b):");
        System.out.println("a = " + a); 

        a /= b;
        System.out.println("Setelah pembagian (a /= b):");
        System.out.println("a = " + a); 
    }
}
