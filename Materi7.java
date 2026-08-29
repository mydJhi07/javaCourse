import java.util.Scanner;

public class Materi7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Meminta input umur dari pengguna
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Evaluasi kondisi dari atas ke bawah (Top-Down)
        if (age < 0) {
            System.out.println("You haven't been born yet!");
        } else if (age == 0) {
            System.out.println("You are a baby!");
        } else if (age >= 65) {
            // Kondisi ini HARUS di atas age >= 18
            System.out.println("You are a senior!");
        } else if (age >= 18) {
            System.out.println("You are an adult!");
        } else {
            // Dieksekusi jika semua kondisi di atas bernilai false (umur 1-17)
            System.out.println("You are a child!");
        }

        scanner.close();
    }
}

/*
 * Pengecekan Tepat (==): Pada kondisi age == 0, program menggunakan operator
 * perbandingan ganda untuk memastikan apakah angka
 * yang diinput benar-benar persis bernilai nol. Jika kamu hanya menggunakan =,
 * program akan error karena itu adalah operator
 * penugasan.
 * 
 * Keharusan Urutan (Top-Down): Perhatikan penempatan age >= 65 yang diletakkan
 * sebelum age >= 18. Jika urutannya dibalik,
 * seseorang yang berumur 70 tahun akan masuk ke dalam blok age >= 18
 * ("You are an adult!"), dan program akan langsung berhenti
 * mengecek ke bawah. Dengan meletakkan kondisi yang lebih tinggi di atas, bug
 * tersebut berhasil dicegah.
 * 
 * Fungsi else Terakhir: Blok else di baris terbawah tidak memiliki kondisi ().
 * Blok ini berfungsi sebagai "keranjang sampah"
 * atau nilai default. Jika pengguna memasukkan angka 12, angka tersebut tidak
 * memenuhi syarat < 0, == 0, >= 65, maupun >= 18.
 * Oleh karena itu, program otomatis akan masuk ke blok else dan mencetak
 * "You are a child!".
 */