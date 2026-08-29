import java.util.Scanner; // 1. Wajib mengimpor kelas Scanner

public class Materi3 {
    public static void main(String[] args) {

        // 2. Membuat objek Scanner untuk membaca input dari keyboard
        Scanner scanner = new Scanner(System.in);

        // Menerima input String (Teks utuh)
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Menerima input Integer (Angka bulat)
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Menerima input Double (Angka desimal)
        System.out.print("What is your GPA: ");
        double gpa = scanner.nextDouble();

        // Menerima input Boolean (true/false)
        System.out.print("Are you a student (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        // 3. MENGATASI MASALAH INPUT BUFFER (Sangat Penting)
        // Memanggil nextLine() kosong untuk membersihkan sisa karakter "Enter" (\n)
        // yang ditinggalkan oleh nextInt(), nextDouble(), atau nextBoolean()
        // sebelumnya.
        scanner.nextLine();

        // Menerima input String lagi setelah membersihkan buffer
        System.out.print("Enter your favorite color: ");
        String color = scanner.nextLine();

        // 4. Menampilkan hasil input
        System.out.println("\n--- Hasil Input ---");
        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("Your GPA is " + gpa);
        System.out.println("You like the color " + color);

        if (isStudent) {
            System.out.println("You are enrolled as a student");
        } else {
            System.out.println("You are not enrolled");
        }

        // 5. Menutup Scanner
        scanner.close();
    }
}

/*
 * Import & Inisialisasi: Program wajib memanggil import java.util.Scanner; di
 * luar kelas. Kemudian, new Scanner(System.in)
 * memberi tahu program untuk "mendengarkan" ketikan yang masuk dari keyboard.
 * 
 * Prompt (Teks Arahan): Bro Code lebih suka menggunakan System.out.print()
 * dibandingkan println() untuk memberikan pertanyaan
 * (prompt). Ini membuat kursor ketikan pengguna tetap berada di baris yang sama
 * dengan pertanyaan sehingga terlihat lebih rapi.
 * 
 * Membaca Sesuai Tipe Data: Program menggunakan metode yang spesifik untuk tipe
 * variabel penampungnya (nextLine untuk String,
 * nextInt untuk int, dll). Jika tipe data yang dimasukkan tidak sesuai (misal
 * diminta int tapi diketik teks desimal), program
 * akan mengalami error (Exception).
 * 
 * Pembersihan Input Buffer: Baris scanner.nextLine(); yang dibiarkan berdiri
 * sendiri tanpa variabel penampung adalah trik
 * wajib. Trik ini bertugas "memakan" karakter Enter (baris baru) yang tidak
 * sengaja tertinggal setelah pengguna mengetik angka
 * atau boolean, sehingga pertanyaan favorite color tidak terlompati.
 * 
 * Keamanan Sumber Daya (Resource): Baris scanner.close(); di akhir program
 * menghentikan fungsi pembacaan input untuk
 * membebaskan memori komputer.
 */