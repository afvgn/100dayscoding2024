public class DecrementExample {
    public static void main(String[] args) {
        int number = 10;

        System.out.println("Nilai awal: " + number);

        --number;
        System.out.println("Setelah prefix decrement (--number): " + number);

        number--;
        System.out.println("Setelah postfix decrement (number--): " + number);
    }
}
