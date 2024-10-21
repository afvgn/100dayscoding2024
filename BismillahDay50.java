import java.util.Scanner;

public class KategoriNilai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan nilai Anda (0-100): ");
        int nilai = scanner.nextInt();

        if (nilai >= 75 && nilai <= 100) {
            System.out.println("Kategori: Lulus");
        } else if (nilai >= 50 && nilai < 75) {
            System.out.println("Kategori: Remedial");
        } else if (nilai >= 0 && nilai < 50) {
            System.out.println("Kategori: Gagal");
        } else {
            System.out.println("Nilai tidak valid. Harap masukkan nilai antara 0-100.");
        }

        scanner.close();
    }
}
