import java.util.Scanner;

public class Perbandingan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan angka pertama: ");
        int angka1 = scanner.nextInt();
        
        System.out.print("Masukkan angka kedua: ");
        int angka2 = scanner.nextInt();
        
        if (angka1 >= angka2) {
            System.out.println(angka1 + " lebih besar sama dengan " + angka2);
        } else {
            System.out.println(angka1 + " lebih kecil dari " + angka2);
        }
        
        if (angka1 <= angka2) {
            System.out.println(angka1 + " lebih kecil sama dengan " + angka2);
        } else {
            System.out.println(angka1 + " lebih besar dari " + angka2);
        }
        
        scanner.close();
    }
}
