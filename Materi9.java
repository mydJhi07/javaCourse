public class Materi9 {
    public static void main(String[] args) {

        // --- Konstanta Matematika ---

        // 1. Math.PI: Mendapatkan nilai konstanta Pi (sekitar 3.14159...)
        System.out.println("Nilai Pi: " + Math.PI);

        // 2. Math.E: Mendapatkan nilai konstanta eksponensial (Euler's number)
        System.out.println("Nilai E: " + Math.E);

        // --- Metode Operasi Matematika Dasar ---

        double result;

        // 3. Math.pow(base, exponent): Memangkatkan suatu bilangan
        // Contoh: 2 pangkat 3
        result = Math.pow(2, 3);
        System.out.println("2 dipangkatkan 3 adalah: " + result);

        // 4. Math.abs(value): Mendapatkan nilai absolut (nilai positif/jarak dari 0)
        // Contoh: Nilai absolut dari -5
        int absoluteValue = Math.abs(-5);
        System.out.println("Nilai absolut dari -5 adalah: " + absoluteValue);

        // 5. Math.sqrt(value): Mencari akar kuadrat dari suatu bilangan
        // Contoh: Akar kuadrat dari 9
        result = Math.sqrt(9);
        System.out.println("Akar kuadrat dari 9 adalah: " + result);

        // --- Metode Pembulatan Angka Desimal ---

        // 6. Math.round(value): Membulatkan angka ke bilangan bulat terdekat
        // Contoh: 3.14 akan dibulatkan ke bawah menjadi 3
        result = Math.round(3.14);
        System.out.println("3.14 dibulatkan terdekat menjadi: " + result);

        // 7. Math.ceil(value): Selalu membulatkan angka desimal ke ATAS
        // (Ceiling/Langit-langit)
        // Contoh: 3.14 akan dipaksa naik menjadi 4
        result = Math.ceil(3.14);
        System.out.println("3.14 dibulatkan ke atas menjadi: " + result);

        // 8. Math.floor(value): Selalu membulatkan angka desimal ke BAWAH
        // (Floor/Lantai)
        // Contoh: 3.99 akan dipaksa turun menjadi 3
        result = Math.floor(3.99);
        System.out.println("3.99 dibulatkan ke bawah menjadi: " + result);

        // --- Metode Pembandingan (Min/Max) ---

        // 9. Math.max(a, b): Mengembalikan nilai terbesar di antara dua angka
        int max = Math.max(10, 20);
        System.out.println("Angka terbesar antara 10 dan 20 adalah: " + max);

        // 10. Math.min(a, b): Mengembalikan nilai terkecil di antara dua angka
        int min = Math.min(10, 20);
        System.out.println("Angka terkecil antara 10 dan 20 adalah: " + min);
    }
}

/*
 * Akses Kelas Math: Semua metode dan konstanta aritmatika kompleks di Java
 * tersimpan di dalam kelas bernama Math.
 * Kamu dapat memanggilnya secara langsung dengan mengetik awalan Math. (dengan
 * huruf 'M' besar).
 * 
 * Pemangkatan dan Akar Kuadrat: Java tidak menggunakan simbol ^ untuk operasi
 * pangkat matematika, melainkan Math.pow().
 * Demikian pula untuk mencari akar kuadrat, kita memanggil Math.sqrt().
 * Keduanya umumnya merespons dengan nilai bertipe double.
 * 
 * Metode Pembulatan: Java menyediakan fleksibilitas dalam pembulatan. Gunakan
 * Math.round() untuk pembulatan wajar sesuai kaidah
 * matematika (desimal $\ge$ 5 naik, $< 5$ turun). Gunakan Math.ceil()
 * (langit-langit) jika ingin selalu dibulatkan ke bilangan
 * bulat yang lebih tinggi, dan gunakan Math.floor() (lantai) jika ingin selalu
 * dibulatkan ke angka yang lebih rendah.
 * 
 * Nilai Mutlak: Penggunaan Math.abs() bertujuan untuk menjadikan setiap
 * bilangan, baik positif maupun negatif, dikembalikan
 * sebagai nilai positifnya.
 */