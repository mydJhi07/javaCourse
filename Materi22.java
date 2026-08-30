import java.util.Random;
import java.util.Scanner;

public class Materi22 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // 1. Variabel Permainan
        int min = 1;
        int max = 100;
        int attempts = 0;
        int guess = 0;

        // random.nextInt(limit) menghasilkan angka dari 0 sampai (limit - 1).
        // Oleh karena itu, rumusnya diubah menggunakan rentang:
        // (max - min + 1) -> Menghasilkan rentang selisih yang pas (100 - 1 + 1) = 100
        // Hasil random dari 0-99 ini kemudian ditambah nilai min (1)
        // sehingga final randomnya pas antara 1 sampai 100.
        int randomNumber = random.nextInt(max - min + 1) + min;

        System.out.println("--- Welcome to the Number Guessing Game ---");
        System.out.printf("I'm thinking of a number between %d and %d.\n", min, max);

        // 2. Loop Permainan Sederhana
        do {
            System.out.print("Enter your guess: ");

            // Validasi Input: Jika yang dimasukkan BUKAN angka
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number.");
                System.out.print("Enter your guess: ");
                scanner.next(); // Membuang input teks yang keliru
            }

            guess = scanner.nextInt();
            attempts++;

            // 3. Evaluasi Tebakan
            if (guess < randomNumber) {
                System.out.println("Too low! Try again.\n");
            } else if (guess > randomNumber) {
                System.out.println("Too high! Try again.\n");
            } else {
                System.out.println("\n🎉 Correct! The number was " + randomNumber);
                System.out.println("It took you " + attempts + " attempts to win.");
            }

            // Loop akan terus berlanjut SELAMA tebakan user (guess) TIDAK SAMA DENGAN angka
            // rahasia
        } while (guess != randomNumber);

        scanner.close();
    }
}