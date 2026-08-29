public class Materi13 {
    public static void main(String[] args) {

        String name = "Bro Code";

        // 1. length(): Mendapatkan panjang / jumlah karakter string
        int length = name.length();
        System.out.println("Panjang string: " + length);

        // 2. charAt(index): Mengambil satu karakter pada posisi indeks tertentu
        char letter = name.charAt(0);
        System.out.println("Karakter pertama (indeks 0): " + letter);

        // 3. indexOf(String): Mencari indeks kemunculan PERTAMA dari suatu
        // karakter/teks
        int firstIndex = name.indexOf("o");
        System.out.println("Indeks huruf 'o' pertama: " + firstIndex);

        // 4. lastIndexOf(String): Mencari indeks kemunculan TERAKHIR dari suatu
        // karakter/teks
        int lastIndex = name.lastIndexOf("o");
        System.out.println("Indeks huruf 'o' terakhir: " + lastIndex);

        // 5. toUpperCase() & toLowerCase(): Mengubah format huruf kapital/kecil
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Lowercase: " + name.toLowerCase());

        // 6. trim(): Menghapus spasi kosong (whitespace) di awal dan di akhir string
        String paddedName = "    Bro Code    ";
        System.out.println("Sebelum trim: '" + paddedName + "'");
        System.out.println("Sesudah trim: '" + paddedName.trim() + "'");

        // 7. replace(old, new): Mengganti karakter tertentu dengan karakter baru
        String replacedName = name.replace('o', 'a');
        System.out.println("Replace 'o' menjadi 'a': " + replacedName);

        // 8. isEmpty(): Mengecek apakah string kosong (tidak ada karakter sama sekali)
        boolean isEmpty = name.isEmpty();
        System.out.println("Apakah string kosong? " + isEmpty);

        // 9. contains(String): Mengecek apakah string mengandung karakter/kata tertentu
        boolean containsSpace = name.contains(" ");
        System.out.println("Apakah string mengandung spasi? " + containsSpace);

        // 10. equals() & equalsIgnoreCase(): Membandingkan kesamaan dua string
        String password = "password123";
        System.out.println("equals ('Password123'): " + password.equals("Password123")); // Case-sensitive
        System.out.println("equalsIgnoreCase ('Password123'): " + password.equalsIgnoreCase("Password123")); // Abaikan
                                                                                                             // kapital
    }
}

/*
 * String adalah Referensi (Reference Data Type): Berbeda dengan tipe data
 * primitif (seperti int atau double), String di Java
 * adalah objek. Oleh karena itu, kita dapat menggunakan dot operator (.)
 * setelah nama variabel untuk memanggil berbagai metode
 * bawaan (built-in methods) yang mempermudah manipulasi teks.
 * 
 * Indeks Berbasis Nol (Zero-Based Indexing): Metode seperti charAt(),
 * indexOf(), dan lastIndexOf() bekerja dengan sistem
 * indeks yang dimulai dari angka nol (0), bukan satu. Jadi, karakter pertama
 * berada di indeks 0, karakter kedua di indeks 1,
 * dan seterusnya. Spasi kosong juga dihitung sebagai satu karakter.
 * 
 * Pengecekan Kesamaan (equals vs ==): Untuk membandingkan nilai antara dua
 * variabel String, sangat disarankan untuk menggunaka
 * .equals() atau .equalsIgnoreCase(), bukan menggunakan operator ==. Operator
 * == pada tipe data referensi akan mengecek apakah
 * kedua variabel menunjuk ke alamat memori yang sama, sedangkan .equals()
 * benar-benar membandingkan isi teks/karakternya.
 * 
 * Sifat Immutability (Tidak Dapat Diubah Langsung): Pemanggilan metode
 * modifikasi seperti toUpperCase(), trim(), atau replace()
 * tidak akan mengubah isi variabel string aslinya secara permanen kecuali
 * hasilnya ditugaskan kembali (di-assign) ke dalam
 * sebuah variabel, misalnya: name = name.trim();.
 */