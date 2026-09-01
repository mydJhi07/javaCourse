public class Materi26 {
    public static void main(String[] args) {

        // ==============================================================
        // 1. Memanggil Method Void (dengan Argumen)
        // ==============================================================
        String name = "SpongeBob";
        int age = 30;

        // Memanggil method happyBirthday dan mengirimkan variabel sebagai argumen
        happyBirthday(name, age);

        System.out.println("\n-----------------------------------\n");

        // ==============================================================
        // 2. Memanggil Method dengan Return Value (Nilai Kembalian)
        // ==============================================================
        double hasilKuadrat = square(3.0);
        System.out.println("Hasil dari 3 kuadrat adalah: " + hasilKuadrat);

        double hasilKubik = cube(3.0);
        System.out.println("Hasil dari 3 pangkat tiga (kubik) adalah: " + hasilKubik);

        System.out.println("\n-----------------------------------\n");

        // ==============================================================
        // 3. Memanggil Method dengan Return Boolean
        // ==============================================================
        int umurPengguna = 21;

        if (ageCheck(umurPengguna)) {
            System.out.println("Verifikasi Berhasil: Anda boleh mendaftar!");
        } else {
            System.out.println("Verifikasi Gagal: Anda harus berusia 18+ untuk mendaftar.");
        }
    }

    // --- DEKLARASI METHODS DI LUAR METHOD MAIN ---

    // Method 1: Tipe 'void' berarti tidak mengembalikan nilai apapun.
    // Tanda kurung () digunakan untuk menerima 'Parameter'.
    static void happyBirthday(String birthdayBoy, int yearsOld) {
        System.out.println("Happy birthday to you!");
        System.out.println("Happy birthday to you!");
        System.out.printf("Happy birthday dear %s!\n", birthdayBoy);
        System.out.printf("You are %d years old.\n", yearsOld);
    }

    // Method 2: Tipe 'double' berarti wajib mengembalikan nilai berupa desimal.
    static double square(double number) {
        return number * number; // Mengembalikan hasil perkalian
    }

    // Method 3: Contoh lain mengembalikan tipe 'double'
    static double cube(double number) {
        return number * number * number;
    }

    // Method 4: Tipe 'boolean' wajib mengembalikan 'true' atau 'false'
    static boolean ageCheck(int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
        // Cara penulisan lebih singkat: return age >= 18;
    }
}

/*
 * Definisi Method: Method (atau Fungsi) adalah blok kode yang dirancang untuk
 * melakukan tugas tertentu dan dapat digunakan
 * berulang kali (reusable code). Kode di dalam method hanya akan dieksekusi
 * jika method tersebut "dipanggil" (called).
 * 
 * Prinsip DRY (Don't Repeat Yourself): Alasan utama menggunakan method adalah
 * menghindari penulisan ulang kode yang sama.
 * Bayangkan jika kamu harus menyanyikan lagu Happy Birthday 3 kali untuk 3
 * orang yang berbeda; daripada copy-paste blok kode
 * tersebut 3 kali, kamu cukup membuat satu method happyBirthday() dan
 * memanggilnya 3 kali.
 * 
 * Analogi Telepon (Arguments & Parameters): Di video, instruktur mengibaratkan
 * tanda kurung () sebagai sepasang telepon yang
 * saling berkomunikasi.
 * 
 * Method main dan method happyBirthday diibaratkan sebagai dua rumah yang
 * bersebelahan. Mereka tidak bisa melihat variabel
 * yang ada di dalam rumah masing-masing (Konsep ini disebut Local Scope).
 * 
 * Agar method happyBirthday tahu nama dan umur yang harus dicetak, method main
 * harus mengirim informasi tersebut lewat
 * telepon (disebut Argumen).
 * 
 * Method happyBirthday harus bersiap mengangkat telepon tersebut dengan
 * menyediakan wadah penampung spesifik (disebut
 * Parameter, misal: String birthdayBoy, int yearsOld).
 * 
 * Return Type (void vs Tipe Data):
 * 
 * Jika method hanya bertugas melakukan sesuatu tanpa memberikan laporan balik
 * (misal mencetak lagu ke layar), gunakan
 * void.
 * 
 * Namun, jika method ditugaskan untuk menghitung atau mengevaluasi sesuatu lalu
 * laporannya dibutuhkan oleh pemanggil
 * (seperti mesin kalkulator yang mengembalikan angka atau pengecekan sistem
 * yang mengembalikan status izin daftar),
 * maka deklarasikan tipe datanya (seperti double, int, atau boolean) dan wajib
 * diakhiri dengan keyword return.
 * 
 * Keyword static: Karena method main di Java bersifat static, maka semua method
 * lain yang dipanggil langsung dari dalam main
 * tanpa membuat objek (Object Instantiation) harus diberi label static juga di
 * depannya.
 */