import java.util.Scanner;

public class Materi11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Deklarasi variabel
        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        // Meminta input dari pengguna
        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        rate = scanner.nextDouble();
        // Mengonversi input persentase (misal 5) menjadi bentuk desimal (0.05)
        rate = rate / 100;

        System.out.print("Enter the number of times compounded per year: ");
        timesCompounded = scanner.nextInt();

        System.out.print("Enter the number of years: ");
        years = scanner.nextInt();

        // Mengkalkulasi jumlah total (Bunga Majemuk)
        // Rumus: A = P(1 + r/n)^(nt)
        amount = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * years);

        // Menampilkan hasil menggunakan printf untuk format desimal
        System.out.printf("The amount after %d years is $%.2f\n", years, amount);

        scanner.close();
    }
}

/*
 * Penerimaan Variabel Spesifik: Program ini memanfaatkan Scanner untuk
 * mengumpulkan empat variabel utama penyusun kalkulasi
 * bunga majemuk: saldo awal investasi (principal), suku bunga (rate), frekuensi
 * pemajemukan bunga dalam setahun
 * (timesCompounded), dan durasi investasi (years).
 * 
 * Penyesuaian Nilai Bunga: Umumnya pengguna mengetik suku bunga dalam
 * persentase utuh (misal, 5 untuk 5%). Namun, rumus
 * matematika memerlukan nilai desimal, sehingga variabel rate wajib dibagi 100
 * (rate / 100) agar kalkulasinya tepat menjadi
 * 0.05.
 * 
 * Penerapan Kelas Math: Evaluasi matematika utama diterapkan melalui metode
 * Math.pow(base, exponent) untuk menangani perhitungan
 * pangkat. Bagian basis adalah (1 + rate / timesCompounded), sementara
 * eksponennya adalah durasi dikali frekuensi
 * (timesCompounded * years).
 * 
 * Optimalisasi Tampilan Angka: Untuk menyajikan hasil mata uang secara
 * profesional, output memanfaatkan metode printf.
 * Tanda %d disisipkan untuk integer (tahun), sedangkan %.2f digunakan guna
 * menampilkan uang (amount) dengan pemotongan
 * otomatis presisi hingga dua angka di belakang koma (merepresentasikan sen).
 */