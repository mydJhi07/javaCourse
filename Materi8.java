import java.util.Random; // 1. Import kelas Random

public class Materi8 {
    public static void main(String[] args) {

        // 2. Membuat objek Random
        Random random = new Random();

        // 3. Menghasilkan Angka Integer Acak (Batas Bawah, Batas Atas Eksklusif)
        // Contoh: Simulasi melempar dadu (1 sampai 6)
        int number1 = random.nextInt(1, 7);
        int number2 = random.nextInt(1, 7);
        int number3 = random.nextInt(1, 7);

        System.out.println("Hasil lempar 3 dadu:");
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);

        System.out.println("-----------------");

        // 4. Menghasilkan Angka Double Acak (antara 0.0 hingga 1.0)
        double myDouble = random.nextDouble();
        System.out.println("Double acak: " + myDouble);

        System.out.println("-----------------");

        // 5. Menghasilkan Boolean Acak (Simulasi lempar koin)
        boolean isHeads = random.nextBoolean();

        if (isHeads) {
            System.out.println("Hasil lempar koin: HEADS (Angka)");
        } else {
            System.out.println("Hasil lempar koin: TAILS (Gambar)");
        }
    }
}