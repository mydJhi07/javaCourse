import java.util.Scanner;

public class Materi12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Meminta status pekerjaan
        System.out.print("Are you currently employed? (true/false): ");
        boolean isEmployed = scanner.nextBoolean();

        if (isEmployed) {
            // Blok ini dieksekusi HANYA JIKA pengguna menjawab 'true' (bekerja)
            System.out.println("Great! You are employed.");

            // Nested If Statement
            System.out.print("Enter your monthly salary: $");
            double salary = scanner.nextDouble();

            if (salary >= 5000) {
                System.out.println("You have a high-paying job. Keep it up!");
            } else if (salary >= 3000) {
                System.out.println("You have a decent salary. Good for you.");
            } else {
                System.out.println("You are earning a modest salary. Consider upskilling.");
            }
        } else {
            // Blok ini dieksekusi jika pengguna menjawab 'false' (tidak bekerja)
            System.out.println("You are currently unemployed.");

            // Nested If Statement
            System.out.print("Are you actively looking for a job? (true/false): ");
            boolean lookingForJob = scanner.nextBoolean();

            if (lookingForJob) {
                System.out.println("Keep applying! The right opportunity is out there.");
            } else {
                System.out.println("Consider upgrading your skills or taking a break.");
            }
        }

        scanner.close();
    }
}

/*
 * Pemahaman Nested If: Struktur nested if (if bersarang) adalah penempatan satu
 * atau lebih pernyataan if di dalam blok if atau
 * else lainnya. Pendekatan ini mendasar dalam pembuatan percabangan hierarkis,
 * di mana suatu kondisi hanya perlu dievaluasi
 * jika dan hanya jika kondisi sebelumnya telah terpenuhi.
 * 
 * Keamanan Eksekusi (Isolasi Logika): Pada contoh di atas, pertanyaan terkait
 * nominal gaji (salary) merupakan informasi
 * sensitif dan berpotensi memicu masalah operasional apabila ditanyakan kepada
 * pengguna yang berstatus pengangguran. Oleh
 * karena itu, pengumpulan data gaji ditempatkan secara eksklusif ke dalam blok
 * evaluasi dari pengguna yang bekerja
 * (isEmployed == true).
 * 
 * Struktur Pohon Keputusan (Decision Tree): Program secara sistematis menangani
 * setiap cabang. Mulanya, jika status bekerja
 * (Employed) adalah true, alur dilanjutkan ke sub-pertanyaan tentang salary.
 * Sementara itu, bila false, program berpindah ke
 * kondisi else untuk bertanya seputar lookingForJob. Teknik ini menjadikan
 * navigasi program efisien sebab tak ada pengecekan
 * kondisi mubazir di luar logika yang relevan.
 */