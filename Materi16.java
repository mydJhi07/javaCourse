public class Materi16 {
    public static void main(String[] args) {

        // Contoh 1: Menentukan Lulus atau Gagal
        int score = 75;
        // Jika score >= 60 benar, kembalikan "PASS", jika salah kembalikan "FAIL"
        String passOrFail = (score >= 60) ? "PASS" : "FAIL";
        System.out.println("Result 1: You " + passOrFail);

        System.out.println("-------------------------");

        // Contoh 2: Menentukan angka Genap (Even) atau Ganjil (Odd)
        int number = 4;
        String evenOrOdd = (number % 2 == 0) ? "EVEN" : "ODD";
        System.out.println("Result 2: The number is " + evenOrOdd);

        System.out.println("-------------------------");

        // Contoh 3: Menentukan Waktu AM atau PM
        int hours = 13; // Format 24 jam (13 = 1 PM)
        String timeOfDay = (hours < 12) ? "AM" : "PM";
        System.out.println("Result 3: The time is " + timeOfDay);

        System.out.println("-------------------------");

        // Contoh 4: Menentukan Rate Pajak berdasarkan Pendapatan
        int income = 30000;
        double taxRate = (income >= 40000) ? 0.25 : 0.15;
        System.out.println("Result 4: Your tax rate is " + taxRate);
    }
}

/*
 * Penyederhanaan If-Else: Operator Ternary adalah jalan pintas (shortcut) yang
 * elegan untuk menggantikan blok pernyataan
 * if-else tradisional. Ini sangat berguna ketika percabangan tersebut hanya
 * bertujuan untuk memberikan nilai
 * (assign value) ke suatu variabel.
 * 
 * Formula Dasar: Operator ini bekerja dengan format logika: (Kondisi) ?
 * NilaiJikaBenar : NilaiJikaSalah;. Kamu bisa
 * membayangkannya seperti sedang bertanya kepada program: "Apakah kondisi ini
 * benar? Jika iya, berikan nilai pertama.
 * Jika tidak, berikan nilai kedua."
 * 
 * Pengembalian Nilai Langsung: Berbeda dengan if konvensional yang mengeksekusi
 * sekumpulan baris kode secara prosedural,
 * operator ternary berorientasi pada hasil (langsung mengembalikan satu nilai).
 * Oleh karena itu, di sebelah kiri operator
 * selalu disiapkan variabel penampung (seperti String passOrFail = ...).
 * 
 * Kesesuaian Tipe Data: Nilai yang dihasilkan di sebelah kiri dan kanan titik
 * dua (:) wajib memiliki tipe data yang cocok
 * satu sama lain, dan juga cocok dengan tipe data variabel penampungnya.
 * Misalnya, pada kalkulasi pajak (taxRate), baik 0.25
 * maupun 0.15 bertipe double
 */