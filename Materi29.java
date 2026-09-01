import java.util.Scanner;

public class Materi29 {

    // 1. Class Scope Variable (Variabel Global)
    // Scanner diletakkan di luar method agar bisa dipakai oleh main(), deposit(),
    // dan withdraw()
    // tanpa harus membuat scanner baru yang berpotensi memakan memori atau bentrok.
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // 2. Deklarasi Variabel Lokal (Local Scope)
        double balance = 0;
        boolean isRunning = true;
        int choice;

        // 3. Loop Utama Program
        while (isRunning) {
            System.out.println("\n********************");
            System.out.println("   BANKING PROGRAM  ");
            System.out.println("********************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("********************");
            System.out.print("Enter your choice (1-4): ");

            choice = scanner.nextInt();

            // 4. Enhanced Switch untuk memproses pilihan user
            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid Choice!");
            }
        }

        System.out.println("\nThank you! Have a nice day.");
        scanner.close(); // Menutup scanner di akhir program untuk menghemat resource
    }

    // ==============================================================
    // KUMPULAN METHOD (FUNGSI) PROGRAM
    // ==============================================================

    // Method untuk menampilkan saldo (Void = tidak mengembalikan nilai, hanya
    // mencetak)
    static void showBalance(double balance) {
        System.out.println("********************");
        // Menggunakan printf untuk membatasi tampilan dua angka di belakang koma (%.2f)
        System.out.printf("Your balance is: $%.2f\n", balance);
    }

    // Method untuk menyetor uang (Mengembalikan nilai double yang akan ditambahkan
    // ke saldo)
    static double deposit() {
        double amount;
        System.out.print("Enter an amount to be deposited: ");
        amount = scanner.nextDouble();

        // Validasi: Uang yang disetor tidak boleh negatif
        if (amount < 0) {
            System.out.println("Amount can't be negative!");
            return 0;
        } else {
            return amount;
        }
    }

    // Method untuk menarik uang (Mengembalikan nilai double yang akan dikurangi
    // dari saldo)
    // Membutuhkan argumen 'balance' agar method ini tahu batas uang yang bisa
    // ditarik
    static double withdraw(double balance) {
        double amount;
        System.out.print("Enter amount to be withdrawn: ");
        amount = scanner.nextDouble();

        // Validasi 1: Uang yang ditarik melebihi saldo yang ada
        if (amount > balance) {
            System.out.println("Insufficient funds!");
            return 0;
        }
        // Validasi 2: Uang yang ditarik tidak boleh negatif
        else if (amount < 0) {
            System.out.println("Amount can't be negative!");
            return 0;
        }
        // Jika semua aman, kembalikan nominal penarikan
        else {
            return amount;
        }
    }
}