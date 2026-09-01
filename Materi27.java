public class Materi27 {
    public static void main(String[] args) {

        // ==============================================================
        // 1. Contoh Overloaded Methods - Operasi Matematika
        // ==============================================================
        System.out.println("--- Contoh 1: Kalkulasi Penjumlahan ---");

        // Java secara otomatis akan tahu method mana yang harus dipanggil
        // berdasarkan JUMLAH argumen yang kita kirimkan.
        double hasil1 = add(1.0, 2.0);
        System.out.println("Penjumlahan 2 angka: " + hasil1);

        double hasil2 = add(1.0, 2.0, 3.0);
        System.out.println("Penjumlahan 3 angka: " + hasil2);

        double hasil3 = add(1.0, 2.0, 3.0, 4.0);
        System.out.println("Penjumlahan 4 angka: " + hasil3);

        System.out.println("\n--- Contoh 2: Mesin Pembuat Pizza ---");
        // ==============================================================
        // 2. Contoh Overloaded Methods - Mesin Pembuat Pizza
        // ==============================================================

        // Membuat pizza hanya dengan roti
        String pesanan1 = bakePizza("flatbread");
        System.out.println("Pesanan 1: " + pesanan1);

        // Membuat pizza dengan roti dan keju
        String pesanan2 = bakePizza("flatbread", "mozzarella");
        System.out.println("Pesanan 2: " + pesanan2);

        // Membuat pizza lengkap dengan roti, keju, dan topping
        String pesanan3 = bakePizza("flatbread", "mozzarella", "pepperoni");
        System.out.println("Pesanan 3: " + pesanan3);
    }

    // --- KUMPULAN OVERLOADED METHODS ---

    // Set Method 1: Penjumlahan
    static double add(double a, double b) {
        return a + b;
    }

    static double add(double a, double b, double c) {
        return a + b + c;
    }

    static double add(double a, double b, double c, double d) {
        return a + b + c + d;
    }

    // Set Method 2: Pembuat Pizza
    static String bakePizza(String bread) {
        return bread + " pizza";
    }

    static String bakePizza(String bread, String cheese) {
        return cheese + " " + bread + " pizza";
    }

    static String bakePizza(String bread, String cheese, String topping) {
        return topping + " " + cheese + " " + bread + " pizza";
    }
}

/*
 * Definisi Overloaded Methods: Method Overloading adalah sebuah kondisi di mana
 * kita memiliki lebih dari satu method dengan
 * nama yang sama persis di dalam sebuah class. Dalam contoh di atas, kita
 * memiliki tiga method bernama add dan tiga method
 * bernama bakePizza.
 * 
 * Syarat Utama (Method Signature): Meskipun namanya sama, method-method
 * tersebut TIDAK BOLEH identik secara keseluruhan.
 * Mereka harus memiliki Method Signature yang unik. Method signature adalah
 * gabungan antara Nama Method + Parameter.
 * 
 * Pembeda Parameter: Agar Java tidak bingung (error), parameter antar method
 * harus berbeda, baik dari segi:
 * 
 * Jumlahnya (misal: satu method punya 2 parameter, yang lain punya 3
 * parameter).
 * 
 * Tipe datanya (misal: satu menerima int, yang lain menerima double atau
 * String).
 * 
 * Urutan tipe datanya (misal: satu menerima (String, int), yang lain menerima
 * (int, String)).
 * 
 * Kenapa Ini Sangat Berguna? Bayangkan jika Overloading tidak ada. Untuk
 * membuat mesin pizza yang bisa menerima jumlah bahan
 * berbeda, kamu harus membuat nama method yang berbeda-beda seperti
 * bakePizzaDenganRotiSaja(), bakePizzaDenganKeju(), dan
 * bakePizzaLengkap(). Ini sangat merepotkan. Dengan Overloading, kita cukup
 * menggunakan satu nama universal (bakePizza), dan
 * Java akan sangat cerdas mendeteksi method mana yang tepat untuk dieksekusi
 * berdasarkan jumlah argumen yang kamu lemparkan
 * saat pemanggilan.
 */