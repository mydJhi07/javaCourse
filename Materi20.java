public class Materi20 {
    public static void main(String[] args) {

        // ==========================================
        // 1. Logika AND (&&) - Kedua kondisi harus BENAR
        // ==========================================
        System.out.println("--- Logika AND (&&) ---");
        int temp = 20;
        boolean isSunny = true;

        // Cek apakah suhu antara 0 hingga 30 derajat DAN cuaca cerah
        if (temp >= 0 && temp <= 30 && isSunny) {
            System.out.println("Cuacanya bagus dan cerah. Ayo pergi keluar! ☀️");
        } else {
            System.out.println("Cuacanya kurang mendukung. ☁️");
        }

        // ==========================================
        // 2. Logika OR (||) - Salah satu kondisi BENAR
        // ==========================================
        System.out.println("\n--- Logika OR (||) ---");
        int userAge = 66;

        // Memberikan diskon jika user adalah anak-anak (di bawah 12 tahun)
        // ATAU lansia (65 tahun ke atas)
        if (userAge <= 12 || userAge >= 65) {
            System.out.println("Anda berhak mendapatkan tiket diskon! 🎫");
        } else {
            System.out.println("Anda harus membayar harga tiket normal.");
        }

        // ==========================================
        // 3. Logika NOT (!) - Membalikkan nilai Boolean
        // ==========================================
        System.out.println("\n--- Logika NOT (!) ---");
        boolean isRaining = false;

        // Membaca: "Jika TIDAK hujan"
        if (!isRaining) {
            System.out.println("Langit terang. Anda tidak perlu membawa payung.");
        } else {
            System.out.println("Bawa payung, sekarang sedang hujan! ☔");
        }

        // ==========================================
        // 4. Kombinasi Validasi Username (AND, OR, NOT)
        // ==========================================
        System.out.println("\n--- Contoh Kasus Validasi Username ---");
        String username = "Bro_Code";

        // Cek jika username terlalu pendek (< 4) ATAU terlalu panjang (> 12)
        if (username.length() < 4 || username.length() > 12) {
            System.out.println("Error: Username harus terdiri dari 4 - 12 karakter.");
        }
        // Cek jika username mengandung spasi ATAU garis bawah
        else if (username.contains(" ") || username.contains("_")) {
            System.out.println("Error: Username tidak boleh mengandung spasi atau garis bawah.");
        }
        // Lulus semua validasi
        else {
            System.out.println("Username diterima! Selamat datang, " + username);
        }
    }
}

/*
 * Operator AND (&&): Mewajibkan keutuhan seluruh parameter evaluasi. Dalam kode
 * contoh pertama, nilai suhu (temp) harus memenuhi syarat >= 0 sekaligus <= 30,
 * dan pada saat bersamaan status cuaca (isSunny) juga harus bernilai true. Jika
 * ada satu saja dari tiga persyaratan ini yang cacat (misal, isSunny diubah
 * menjadi false), maka program secara keseluruhan menganggap pernyataan
 * tersebut false (salah).
 * 
 * Operator OR (||): Operator ini bersifat lebih fleksibel dan memaafkan.
 * Menggunakan simbol garis vertikal ganda || (sering disebut pipe), program
 * hanya membutuhkan minimal satu kondisi yang terpenuhi untuk mengeksekusi blok
 * kode. Pada contoh kedua, jika userAge adalah 66, syarat pertama (<= 12) jelas
 * keliru, namun karena syarat kedua (>= 65) bernilai benar, maka program tetap
 * mengeksekusi pernyataan.
 * 
 * Operator NOT (!): Berperan sebagai alat pemutarbalik nilai (invers logika).
 * Operator ini menggunakan simbol tanda seru (!). Jika sebuah variabel boolean
 * asalnya berisi true, maka ! akan mengubah cara bacanya menjadi false, begitu
 * juga sebaliknya. Sangat berguna untuk menyederhanakan ekspresi
 * "Jika Tidak...", misal memeriksa "Jika Tidak Kosong" (!name.isEmpty()).
 * 
 * Keamanan Eksekusi (Short-Circuiting): Baik operator && maupun || memiliki
 * sifat pintar yang disebut short-circuiting. Jika pada && kondisi pertama
 * sudah false, Java otomatis menghentikan pengecekan sisa kondisi di kanannya
 * (karena hasil pastilah false). Sebaliknya, pada ||, jika kondisi pertama
 * sudah true, sisa kondisinya akan diabaikan karena tujuan utamanya (salah satu
 * true) sudah tercapai. Hal ini menghemat kinerja program.
 */