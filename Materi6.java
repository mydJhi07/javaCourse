import java.util.Scanner;

public class Materi6 {
    public static void main(String[] args) {

        // Membuat objek Scanner untuk menerima input
        Scanner scanner = new Scanner(System.in);

        // 1. Deklarasi Variabel di awal
        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        // 2. Meminta Input dari Pengguna
        System.out.print("What item would you like to buy?: ");
        item = scanner.nextLine();

        System.out.print("What is the price for each?: ");
        price = scanner.nextDouble();

        System.out.print("How many would you like?: ");
        quantity = scanner.nextInt();

        // 3. Proses Kalkulasi
        total = price * quantity;

        // 4. Menampilkan Output
        // Menggunakan \n untuk memberikan jarak satu baris kosong
        System.out.println("\nYou have bought " + quantity + " " + item + "/s");
        System.out.println("Your total is " + currency + total);

        // Menutup Scanner sebagai best practice
        scanner.close();
    }
}

/*
 * Penggunaan print vs println: Pada saat memberikan instruksi input (prompt),
 * program menggunakan System.out.print() agar kursor
 * pengguna tetap berada di sebelah kanan teks instruksi, bukan pindah ke baris
 * bawahnya ****.
 * 
 * Karakter Escape \n: Pada baris cetak "\nYou have bought...", ditambahkan
 * karakter \n (newline) di dalam tanda kutip. Tujuannya
 * adalah untuk memberikan satu baris kosong jarak antara input terakhir yang
 * diketik pengguna dengan hasil ringkasan program
 * agar tampilannya di konsol lebih rapi ****.
 * 
 * Tanda Miring "s" (/s): Di akhir output barang, ditambahkan string "/s"
 * sebagai trik sederhana (misalnya "pizza/s") untuk
 * menangani tata bahasa Inggris (apakah barangnya tunggal atau jamak) tanpa
 * perlu membuat logika percabangan yang rumit untuk
 * saat ini ****.
 * 
 */