public class Materi24 {
    public static void main(String[] args) {

        // ==========================================
        // 1. Contoh Penggunaan BREAK ("Stop")
        // ==========================================
        System.out.println("--- Contoh Keyword BREAK ---");

        for (int i = 0; i < 10; i++) {
            // Jika nilai i mencapai 5, loop akan dihentikan sepenuhnya
            if (i == 5) {
                break;
            }
            System.out.print(i + " ");
        }
        // Output: 0 1 2 3 4
        // Eksekusi melompat ke baris ini setelah break

        System.out.println("\n\n--- Contoh Keyword CONTINUE ---");

        // ==========================================
        // 2. Contoh Penggunaan CONTINUE ("Skip")
        // ==========================================
        for (int i = 0; i < 10; i++) {
            // Jika nilai i mencapai 5, kode di bawahnya (dalam loop ini) diabaikan,
            // dan program langsung melompat ke iterasi berikutnya (i = 6)
            if (i == 5) {
                continue;
            }
            System.out.print(i + " ");
        }
        // Output: 0 1 2 3 4 6 7 8 9 (Angka 5 hilang karena di-skip)
        System.out.println();
    }
}

/*
 * Analogi Sederhana: Jika loop (for, while, atau do-while) diibaratkan sebagai
 * pemutar film, maka break adalah tombol "Stop"
 * (berhenti total), sedangkan continue adalah tombol "Skip" (melewati bagian
 * saat ini dan lanjut ke adegan berikutnya).
 * 
 * Keyword break: Berfungsi untuk menghancurkan/keluar dari struktur loop secara
 * paksa. Pada contoh pertama, program mulai
 * menghitung dari 0 hingga 9. Namun, di dalam loop terdapat kondisi if (i == 5)
 * { break; }. Ketika counter i menyentuh angka 5,
 * program langsung "kabur" dari blok for loop tersebut, sehingga angka 5 dan
 * seterusnya tidak pernah dicetak.
 * 
 * Keyword continue: Berfungsi untuk mengabaikan sisa instruksi hanya pada
 * putaran saat ini, dan langsung memicu
 * pembaruan/iterasi selanjutnya. Pada contoh kedua, saat i == 5 bernilai benar,
 * perintah continue dijalankan. Akibatnya,
 * perintah System.out.print di bawahnya dilewati khusus untuk siklus tersebut.
 * Program kemudian melompat kembali ke atas,
 * memacu i++ menjadi 6, dan siklus berlanjut normal. Itulah sebabnya angka 5
 * lenyap dari hasil cetakan.
 */