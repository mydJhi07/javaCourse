import java.util.Scanner;

public class Materi19 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 1. Deklarasi Variabel
        double num1 = 0;
        double num2 = 0;
        char operator;
        double result = 0;
        boolean validOperation = true;

        // 2. Input Angka Pertama
        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble();

        // 3. Input Operator
        System.out.print("Enter an operator (+, -, *, /, ^): ");
        // Membaca karakter pertama dari input string
        operator = scanner.next().charAt(0);

        // 4. Input Angka Kedua
        System.out.print("Enter the second number: ");
        num2 = scanner.nextDouble();

        // 5. Evaluasi Matematika dengan Enhanced Switch
        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;

            // Logika khusus untuk pembagian (mencegah infinity / crash)
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("Error: Cannot divide by zero.");
                    validOperation = false;
                } else {
                    result = num1 / num2;
                }
            }

            // Menggunakan kelas Math untuk menghitung pangkat (Power)
            case '^' -> result = Math.pow(num1, num2);

            // Penanganan input operator yang tidak dikenali
            default -> {
                System.out.println("Error: Invalid operator.");
                validOperation = false;
            }
        }

        // 6. Tampilkan Hasil (Hanya jika operasi valid)
        if (validOperation) {
            System.out.printf("Result: %.2f\n", result);
        }

        scanner.close();
    }
}

/*
 * Penerimaan Karakter Tunggal (charAt(0)): Karena operator matematika (+, -, *,
 * /) direpresentasikan dengan satu karakter,
 * kita menggunakan tipe data char. Namun, fungsi Scanner.next() secara default
 * mengembalikan nilai berupa teks (String). Oleh
 * karenanya, kita memanggil charAt(0) di ujung perintah untuk mengekstrak hanya
 * karakter urutan pertama dari input yang
 * diketik pengguna.
 * 
 * Pemblokiran Eksekusi dengan Boolean (validOperation): Variabel validOperation
 * (yang bernilai awal true) berfungsi sebagai
 * pelindung logika (flag). Jika pengguna memasukkan operator asal-asalan
 * (memicu default) atau mencoba membagi angka dengan
 * nol (memicu num2 == 0), maka validOperation akan diubah menjadi false.
 * Akibatnya, perintah System.out.printf di baris
 * terbawah program tidak akan dijalankan, mencegah aplikasi mencetak nilai
 * result yang keliru (misal 0.00).
 * 
 * Blok Eksekusi Multi-Baris pada Enhanced Switch: Pada Enhanced Switch, kita
 * bisa menjalankan operasi yang terdiri dari
 * beberapa baris kode sekaligus untuk satu case. Caranya adalah dengan
 * membungkus instruksi-instruksi tersebut di dalam kurung
 * kurawal { ... }, seperti yang dipraktikkan pada penanganan logika pembagian
 * (case '/').
 * 
 * Keamanan Pembagian (Zero Division): Jika sebuah angka dibagi dengan nilai nol
 * (0) pada tipe data double, Java tidak akan
 * serta merta crash, melainkan menghasilkan nilai Infinity. Untuk menangani
 * skenario tidak logis ini, diperlukan pengecekan
 * bersyarat di dalam case pembagian.
 */