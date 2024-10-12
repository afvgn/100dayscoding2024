import java.util.Scanner;

public class JumlahDuaAngka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int angka1 = scanner.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int angka2 = scanner.nextInt();

        int jumlah = angka1 + angka2;
        System.out.println("Jumlah dari " + angka1 + " dan " + angka2 + " adalah: " + jumlah);

        scanner.close();
    }
}
