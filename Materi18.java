import java.util.Scanner;

public class Materi18 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the day of the week: ");
        String day = scanner.nextLine();

        // Enhanced Switch (Diperkenalkan mulai Java 14)
        switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" ->
                System.out.println("It is a weekday 💼");

            case "Saturday", "Sunday" ->
                System.out.println("It is the weekend 🎉");

            default ->
                System.out.println(day + " is not a valid day");
        }

        scanner.close();
    }
}

/*
 * Pembaruan Sintaks (Java 14+): Enhanced Switch adalah versi modern dari
 * switch-case tradisional yang diperkenalkan sejak
 * rilis Java 14. Tujuannya adalah membuat evaluasi percabangan menjadi jauh
 * lebih ringkas, mudah dibaca, dan aman dari
 * kesalahan umum.
 * 
 * Penggunaan Arrow Operator (->): Berbeda dengan switch tradisional yang
 * memakai tanda titik dua (:), versi enhanced
 * memanfaatkan operator panah (->). Keuntungan terbesarnya adalah operator ini
 * secara otomatis "menghentikan" eksekusi
 * (built-in break). Dengan ini, kita tidak perlu lagi menuliskan kata kunci
 * break di akhir setiap case untuk mencegah masalah
 * fall-through (di mana program tanpa sengaja mengeksekusi blok case di
 * bawahnya).
 * 
 * Penggabungan Case (Grouping): Jika ada banyak kondisi yang memicu
 * hasil/tindakan yang persis sama, Enhanced Switch
 * memungkinkan kita untuk menggabungkannya di dalam satu baris saja menggunakan
 * pemisah koma (contoh: case "Monday",
 * "Tuesday", ...). Ini adalah penerapan nyata dari prinsip pemrograman DRY
 * (Don't Repeat Yourself) yang memangkas drastis
 * redundansi kode.
 * 
 * Klausul Default: Berfungsi persis seperti else pada if-else. Jika variabel
 * yang dievaluasi (dalam hal ini teks pada day)
 * tidak memiliki kecocokan dengan nilai case manapun (misal pengguna mengetik
 * "Pizza day"), maka blok default akan dieksekusi
 * sebagai nilai cadangan (fallback).
 */