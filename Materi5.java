public class Materi5 {
    public static void main(String[] args) {

        // 1. OPERATOR MATEMATIKA DASAR
        int x = 10;
        int y = 2;
        int z; // Variabel untuk menyimpan hasil

        z = x + y; // Penjumlahan (Hasil: 12)
        z = x - y; // Pengurangan (Hasil: 8)
        z = x * y; // Perkalian (Hasil: 20)
        z = x / y; // Pembagian (Hasil: 5)
        z = x % y; // Modulus/Sisa Bagi (Hasil: 0, karena 10 dibagi 2 habis)

        // Contoh Modulus yang bersisa
        int remainder = 10 % 3;
        System.out.println("Sisa pembagian 10 % 3 adalah: " + remainder); // Output: 1

        // 2. AUGMENTED ASSIGNMENT OPERATORS (Cara Singkat)
        int a = 10;
        int b = 3;

        // Daripada menulis a = a + b;
        a += b; // Sekarang nilai 'a' menjadi 13
        System.out.println("Hasil a += b adalah: " + a);

        // Berlaku juga untuk yang lain:
        // a -= b;
        // a *= b;
        // a /= b;
        // a %= b;

        // 3. INCREMENT & DECREMENT OPERATORS (+1 atau -1)
        int counter = 1;

        counter++; // Menambah 1. Nilai counter sekarang 2
        counter++; // Menambah 1 lagi. Nilai counter sekarang 3
        System.out.println("Nilai counter setelah increment: " + counter); // Output: 3

        counter--; // Mengurangi 1. Nilai counter kembali ke 2
        System.out.println("Nilai counter setelah decrement: " + counter); // Output: 2

        // 4. ORDER OF OPERATIONS (PEMDAS) & INTEGER DIVISION
        // Persamaan: 3 + 4 * (7 - 5) / 2.0
        // Menggunakan 2.0 (double) agar hasil pembagian tidak membuang nilai desimal
        double result = 3 + 4 * (7 - 5) / 2.0;

        System.out.println("Hasil perhitungan (PEMDAS) adalah: " + result); // Output: 7.0
    }
}

/*
 * Operator Dasar: Java menggunakan simbol standar untuk matematika (+, -, *,
 * /). Khusus untuk ^ (pangkat), Java tidak
 * menggunakannya untuk pemangkatan (melainkan untuk operasi bitwise).
 * Pemangkatan akan menggunakan Math.pow().
 * 
 * Modulus (%): Sangat berguna dalam logika pemrograman. Jika x % 2 == 0,
 * berarti x adalah bilangan genap. Jika x % 2 == 1,
 * berarti bilangan ganjil.
 * 
 * Augmented Assignment (+=, -=, dll): Ini murni jalan pintas penulisan kode
 * (syntax sugar) agar tidak perlu mengulang nama
 * variabel yang sama dua kali. a = a + 5 persis sama fungsinya dengan a += 5.
 * 
 * Increment/Decrement (++ dan --): Khusus digunakan jika kamu hanya ingin
 * menambah atau mengurangi nilai tepat sebesar 1. Ini
 * sangat sering digunakan pada sistem looping (perulangan) untuk menghitung
 * putaran.
 * 
 * Perhatian pada Integer Division: Pada kode di bagian PEMDAS, Bro Code
 * menggunakan angka 2.0 (tipe double) alih-alih 2
 * (tipe int). Jika menggunakan integer (2), Java akan melakukan integer
 * division yang memotong paksa angka desimal di belakang
 * koma, sehingga hasilnya bisa jadi tidak akurat.
 */