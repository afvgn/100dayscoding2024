import java.util.Scanner;

public class PerbandinganAngka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int angkaPertama = scanner.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int angkaKedua = scanner.nextInt();

        if (angkaPertama > angkaKedua) {
            System.out.println(angkaPertama + " lebih besar dari " + angkaKedua);
        } else if (angkaPertama < angkaKedua) {
            System.out.println(angkaPertama + " lebih kecil dari " + angkaKedua);
        } else {
            System.out.println("Kedua angka sama.");
        }
        scanner.close();
    }
}
