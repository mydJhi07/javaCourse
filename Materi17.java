import java.util.Scanner;

public class Materi17 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Deklarasi variabel
        double temp;
        double newTemp;
        String unit; // Menggunakan String agar mudah diubah menjadi huruf kapital (toUpperCase)

        // Meminta input suhu dari pengguna
        System.out.print("Enter the temperature: ");
        temp = scanner.nextDouble();

        // Membersihkan karakter newline sisa dari nextDouble()
        // walau tidak selalu wajib di kasus ini, tapi sangat disarankan.
        // Tapi mari ikuti cara di video, menggunakan .next() untuk mengambil input
        // kata/karakter tanpa spasi

        System.out.print("Convert to Celsius or Fahrenheit? (C or F): ");
        // .next() mengambil input kata, dan kita rantai (method chaining) dengan
        // .toUpperCase()
        unit = scanner.next().toUpperCase();

        // Operator Ternary untuk mengevaluasi apakah akan diubah ke Celsius atau
        // Fahrenheit
        // Logika: Jika unit sama dengan "C", jalankan rumus F to C, JIKA SALAH,
        // jalankan rumus C to F
        newTemp = (unit.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 5 / 9) + 32;

        // Menampilkan hasil format %.1f untuk membatasi 1 desimal
        // %s untuk format String (satuan unit)
        // \u00B0 adalah escape sequence di Java untuk simbol derajat (°)
        System.out.printf("The new temperature is: %.1f\u00B0 %s\n", newTemp, unit);

        scanner.close();
    }
}