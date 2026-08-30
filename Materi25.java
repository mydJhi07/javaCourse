import java.util.Scanner;

public class Materi25 {
    public static void main(String[] args) {
        // ==============================================================
        // 1. NESTED LOOP DASAR (Perulangan dalam Perulangan)
        // ==============================================================
        System.out.println("--- Contoh 1: Nested Loop Biasa ---");
        // Loop ini akan mengulang rutinitas sebanyak 3 kali (Outer Loop)
        for (int i = 1; i <= 3; i++) {
            System.out.print("Siklus ke-" + i + ": ");

            // Di dalam setiap siklus 'i', loop 'j' akan menghitung dari 1 sampai 5 (Inner
            // Loop)
            for (int j = 1; j <= 5; j++) {
                System.out.print(j + " ");
            }
            // Memberi baris baru setelah inner loop selesai mengeksekusi
            System.out.println();
        }

        System.out.println("\n--- Contoh 2: Matriks Kustom ---");
        // ==============================================================
        // 2. MINI PROJECT: Matriks Karakter (Penerapan Nested Loop)
        // ==============================================================
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris (Rows): ");
        int rows = scanner.nextInt();

        System.out.print("Masukkan jumlah kolom (Columns): ");
        int cols = scanner.nextInt();

        System.out.print("Masukkan simbol (Contoh: $, #, *, @): ");
        char symbol = scanner.next().charAt(0);

        System.out.println("\nHasil Matriks Anda:");

        // --- OUTER LOOP: Mengontrol baris vertikal ---
        // Akan berulang sebanyak jumlah baris (Rows)
        for (int i = 0; i < rows; i++) {

            // --- INNER LOOP: Mengontrol pengisian kolom secara horizontal ---
            // Setiap baris akan diisi dengan simbol, berulang sebanyak jumlah kolom (Cols)
            for (int j = 0; j < cols; j++) {
                System.out.print(symbol + " ");
            }

            // Menutup satu baris yang selesai dan pindah ke baris (Rows) berikutnya
            System.out.println();
        }

        scanner.close();
    }
}
