import java.util.Scanner;

public class Materi21 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = ""; // Variabel name diinisialisasi dengan string kosong
        int age = -1;

        // ==========================================
        // 1. Contoh WHILE LOOP - Memaksa User Input Nama
        // ==========================================
        // Loop akan terus berjalan SELAMA variabel 'name' masih kosong (empty)
        while (name.isEmpty()) {
            System.out.print("Enter your name: ");
            name = scanner.nextLine(); // Membaca input teks dari user

            // Jika user hanya menekan Enter tanpa mengetik apa-apa,
            // name.isEmpty() akan tetap bernilai true, dan loop akan diulang.
            if (name.isEmpty()) {
                System.out.println("Error: Name cannot be empty. Please try again.\n");
            }
        }

        System.out.println("Hello, " + name + "!");

        // ==========================================
        // 2. Contoh DO-WHILE LOOP - Validasi Umur
        // ==========================================
        // Loop ini akan menjalankan blok kode MINIMAL SATU KALI,
        // lalu baru mengevaluasi kondisi di bagian akhir.
        do {
            System.out.print("\nEnter your age (must be a positive number): ");

            // Validasi untuk mencegah program crash jika user memasukkan huruf
            while (!scanner.hasNextInt()) {
                System.out.println("Error: Please enter a valid number.");
                System.out.print("Enter your age: ");
                scanner.next(); // Membersihkan input yang salah
            }

            age = scanner.nextInt();

            // Jika age < 0, maka syarat loop terpenuhi (true),
            // sehingga program akan kembali ke atas mengulang perintah DO.
            if (age < 0) {
                System.out.println("Error: Your age cannot be negative. Try again.");
            }

        } while (age < 0);

        System.out.println("You are " + age + " years old.");

        // Membersihkan karakter newline (\n) yang tertinggal dari nextInt()
        scanner.nextLine();

        // ==========================================
        // 3. Contoh WHILE LOOP - Menu Interaktif (Game Sederhana)
        // ==========================================
        String response = "";

        // Membaca: Selama respons TIDAK sama dengan "Q", terus jalankan loop
        while (!response.equals("Q")) {
            System.out.println("\n--- Game Menu ---");
            System.out.println("Press 'Q' to quit.");
            System.out.println("Press any other key to keep playing.");
            System.out.print("Your choice: ");

            // Membaca input user dan mengubahnya menjadi huruf kapital agar
            // validasi ("Q") tidak terpengaruh oleh huruf kecil/besar.
            response = scanner.nextLine().toUpperCase();

            if (!response.equals("Q")) {
                System.out.println("You are still playing the game... 🎮");
            }
        }

        System.out.println("You have quit the game. Thanks for playing!");

        scanner.close();
    }
}

/*
 * Konsep Utama While Loop: Diibaratkan sebagai pernyataan if yang dieksekusi
 * berulang-ulang. Selama kondisi yang dievaluasi
 * bernilai true, program akan terperangkap di dalam blok kode tersebut
 * selamanya. Pada bagian program pertama (input nama),
 * loop memverifikasi parameter name.isEmpty(). Bila pengguna bandel dan hanya
 * menekan Enter, variabel name tetap kosong
 * (true), alhasil program akan memaksa mereka kembali mengisi nama hingga
 * syarat tersebut menjadi false.
 * 
 * Perbedaan Do-While Loop: Pada While Loop standar, jika kondisi sudah false
 * sejak awal, blok kode bisa jadi tidak akan pernah
 * dieksekusi sama sekali. Namun, Do-While Loop menjamin bahwa instruksi di
 * dalam blok do { ... } akan dieksekusi minimal satu
 * kali, karena pengecekan kondisi baru dilakukan di bagian paling akhir (while
 * (kondisi);). Ini sangat ideal untuk antarmuka
 * validasi input, di mana kita setidaknya harus meminta angka kepada pengguna
 * (eksekusi pertama) sebelum memverifikasi apakah
 * angka itu masuk akal atau tidak (misal, tidak boleh negatif).
 * 
 * Mengantisipasi Infinite Loop: Risiko terbesar menggunakan While Loop adalah
 * terperangkap selamanya (infinite loop). Hal ini
 * terjadi jika kondisi evaluasi tidak pernah memiliki peluang untuk berubah
 * menjadi false. Itulah sebabnya di dalam setiap blok
 * while, harus ada mekanisme perbaruan variabel (contoh: name =
 * scanner.nextLine() atau age = scanner.nextInt()) untuk memicu
 * jalan keluar.
 * 
 * Penanganan Error Input (!scanner.hasNextInt()): Saat meminta nextInt(),
 * program Java rentan mengalami crash mendadak
 * (InputMismatchException) jika pengguna usil mengetikkan abjad ("Dua puluh").
 * Untuk mengatasinya, kita membungkusnya
 * dengan nested while loop tambahan untuk memverifikasi apakah input
 * selanjutnya benar-benar sebuah integer. Jika bukan,
 * scanner.next() digunakan untuk membuang teks bodong tersebut, dan pengguna
 * diminta mengisi ulang.
 */