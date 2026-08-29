public class Materi10 {
    public static void main(String[] args) {

        String name = "SpongeBob";
        char firstLetter = 'S';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;

        // 1. Format Specifier %s (String)
        System.out.printf("Hello %s\n", name);

        // 2. Format Specifier %c (Character)
        System.out.printf("Your name starts with %c\n", firstLetter);

        // 3. Format Specifier %d (Decimal/Integer)
        System.out.printf("You are %d years old\n", age);

        // 4. Format Specifier %f (Floating-point)
        // Default %f akan menampilkan 6 angka di belakang koma
        System.out.printf("You are %f inches tall\n", height);

        // 5. Format Specifier %b (Boolean)
        System.out.printf("Employed: %b\n", isEmployed);

        // 6. Menggabungkan Multiple Variables
        System.out.printf("%s is %d years old\n", name, age);

        System.out.println("-------------------------");

        // --- Fitur Tambahan printf ---

        // 7. Precision (Menentukan jumlah angka desimal)
        // %.1f -> 1 angka di belakang koma. Angka otomatis dibulatkan (rounded).
        double price = 10.15;
        System.out.printf("Precision: %.1f\n", price);

        // 8. Flags (Menambahkan karakter/simbol tertentu)
        // %+f -> Menampilkan tanda + untuk angka positif
        // %,f -> Menambahkan koma sebagai pemisah ribuan
        // %(f -> Menampilkan tanda kurung ( ) untuk angka negatif, bukan tanda minus -
        double negativePrice = -54.1;
        System.out.printf("Flags (+): %+f\n", price);
        System.out.printf("Flags (,): %,f\n", 9999000.0);
        System.out.printf("Flags (()): %(f\n", negativePrice);

        // 9. Width (Menentukan lebar minimum / jumlah karakter)
        // Berguna agar tampilan vertikal lebih rapi (rata kanan/kiri)
        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.println("\nWidth (Right Justified):");
        System.out.printf("%4d\n", id1);
        System.out.printf("%4d\n", id2);

        // %04d -> Zero padding (sisa spasi kosong diisi dengan angka 0)
        System.out.println("\nWidth (Zero Padding):");
        System.out.printf("%04d\n", id1);
        System.out.printf("%04d\n", id2);
        System.out.printf("%04d\n", id3);
        System.out.printf("%04d\n", id4);

        // %-4d -> Left Justified (Rata kiri, angka minus)
        System.out.println("\nWidth (Left Justified):");
        System.out.printf("%-4d\n", id1);
        System.out.printf("%-4d\n", id2);
    }
}