import java.util.Scanner;

public class ContohSwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka (1-5) untuk hari: ");
        int hari = scanner.nextInt();

        switch (hari) {
            case 1:
                System.out.println("Hari Senin");
                break;
            case 2:
                System.out.println("Hari Selasa");
                break;
            case 3:
                System.out.println("Hari Rabu");
                break;
            case 4:
                System.out.println("Hari Kamis");
                break;
            case 5:
                System.out.println("Hari Jumat");
                break;
            default:
                System.out.println("Input tidak valid! Silakan masukkan angka antara 1 dan 5.");
                break;
        }

        scanner.close();
    }
}
