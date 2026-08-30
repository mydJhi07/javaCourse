import java.util.Scanner;

public class Materi23 {
    public static void main(String[] args) {

        // ==========================================
        // 1. Contoh For Loop - Menghitung Mundur (Countdown)
        // ==========================================
        System.out.println("--- Hitung Mundur Tahun Baru ---");

        // Loop dimulai dari i=10, berhenti jika i=0, dan i dikurangi 1 setiap putaran
        // (i--)
        for (int i = 10; i > 0; i--) {
            System.out.println(i);

            // Perintah Thread.sleep(1000) membuat program menjeda
            // ekseskusinya selama 1 detik (1000 milidetik).
            // Wajib dibungkus try-catch untuk mengantisipasi InterruptedException.
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Countdown terganggu!");
            }
        }
        System.out.println("Happy New Year! 🎉\n");

        // ==========================================
        // 2. Contoh For Loop - Increment dengan Angka Lain
        // ==========================================
        System.out.println("--- Menghitung Kelipatan 3 ---");

        // Loop dapat mengontrol besar langkah iterasi (Step).
        // i += 3 berarti nilai i ditambah 3 di setiap akhir putaran.
        for (int i = 0; i <= 15; i += 3) {
            System.out.println("Iterasi: " + i);
        }

        // ==========================================
        // 3. Contoh For Loop - Berdasarkan User Input
        // ==========================================
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nBerapa kali Anda ingin mencetak pesan ini? : ");
        int userLimit = scanner.nextInt();

        // Loop akan berjalan bergantung pada input pengguna.
        // Ini lebih aman dari infinite loop karena batasan pastinya bisa dikalkulasi.
        for (int i = 1; i <= userLimit; i++) {
            System.out.println("Pesan ke-" + i + " dari For Loop!");
        }

        scanner.close();
    }
}

/*
 * Pembeda Utama For Loop: Berbeda dengan While Loop yang berjalan secara
 * "gelap" mengandalkan kondisi tunggal, for loop
 * dirancang khusus jika sang pemrogram sedari awal sudah mengetahui dengan
 * pasti berapa kali iterasi kode harus dijalankan.
 * 
 * Struktur 3 Bagian: Blok pengondisian for ( ... ) memiliki 3 ruas pernyataan
 * yang selalu dipisahkan oleh tanda titik koma (;).
 * 
 * Inisialisasi (Initialization): int i = 10; – Dijalankan hanya sekali di awal
 * mula, biasanya untuk membuat nilai
 * penghitung (disebut counter atau variabel index).
 * 
 * Kondisi (Condition): i > 0; – Dievaluasi sebelum tiap putaran, mirip dengan
 * syarat pada while. Putaran akan berhenti
 * ketika ini bernilai false.
 * 
 * Pembaruan (Step/Update): i-- atau i++ – Bagian yang dijalankan tepat di akhir
 * tiap siklus loop, fungsinya merevisi nilai
 * counter agar bergerak mendekati titik akhir (titik terminasi loop).
 * 
 * Modifikasi Langkah (Step): Bagian pembaruan (i++) tidak melulu harus
 * bertambah satu. Seperti pada contoh kedua,
 * instruksi i += 3 berarti siklus tidak memanggil angka satu per satu,
 * melainkan melompat 3 angka tiap putaran
 * (0, 3, 6, 9...).
 * 
 * Variabel Terisolasi (Scope): Apabila variabel i (index) dideklarasikan utuh
 * di dalam perisai blok for (int i = ... ),
 * maka variabel tersebut tidak akan bisa diakses di luar struktur loop. Jika
 * kamu mencoba memanggil System.out.println(i)
 * di luar batas kurung kurawal {}, Java akan memunculkan pesan error.
 */