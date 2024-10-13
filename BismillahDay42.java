Tentu! Berikut adalah kode Java tanpa penjelasan:

```java
import java.util.Scanner;

public class Perbandingan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan pertama: ");
        int bilangan1 = scanner.nextInt();

        System.out.print("Masukkan bilangan kedua: ");
        int bilangan2 = scanner.nextInt();

        if (bilangan1 == bilangan2) {
            System.out.println("Bilangan pertama sama dengan bilangan kedua.");
        } else {
            System.out.println("Bilangan pertama tidak sama dengan bilangan kedua.");
        }

        scanner.close();
    }
}
```
