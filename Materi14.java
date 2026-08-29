public class Materi14 {
    public static void main(String[] args) {

        // Deklarasi string
        String email = "bro123@gmail.com";

        // 1. substring(startIndex, endIndex): Mengekstrak karakter berdasar batas
        // awal-akhir
        // - startIndex bersifat inklusif (termasuk)
        // - endIndex bersifat eksklusif (tidak termasuk karakter di index tsb)
        // Contoh: Mengambil "bro123"
        String username = email.substring(0, 6);
        System.out.println("Username: " + username);

        // 2. substring(startIndex): Mengekstrak mulai dari indeks tertentu hingga akhir
        // string
        // Contoh: Mengambil "gmail.com"
        String domain = email.substring(7);
        System.out.println("Domain: " + domain);

        // 3. Penggunaan Dinamis dengan indexOf()
        // Menggabungkan indexOf() agar substring bekerja fleksibel tanpa menghitung
        // karakter secara manual.
        // Index 'atSign' diletakkan sebagai pembatas (endIndex)
        int atIndex = email.indexOf("@");

        String dynamicUsername = email.substring(0, atIndex);
        // atIndex ditambah 1 (+1) agar karakter "@" dilewati/dibuang
        String dynamicDomain = email.substring(atIndex + 1);

        System.out.println("\nDynamic Extraction:");
        System.out.println("Extracted Username: " + dynamicUsername);
        System.out.println("Extracted Domain: " + dynamicDomain);
    }
}

/*
 * Pemisahan Teks (substring): Fungsi substring adalah salah satu utilitas
 * krusial pada manipulasi string di Java untuk memotong
 * dan mengisolasi bagian tertentu dari satu kesatuan string yang panjang.
 * Metode ini menciptakan objek string baru dari hasil
 * potongan, menjaga string asalnya tetap utuh.
 * 
 * Aturan Ekstraksi Inklusif-Eksklusif: Konsep utama dari substring(startIndex,
 * endIndex) adalah cara Java membaca batas.
 * Argumen pertama (startIndex) bersifat inklusif, artinya karakter pada indeks
 * tersebut ikut terambil. Namun, argumen kedua
 * (endIndex) bersifat eksklusif, sehingga program akan memotong tepat di depan
 * karakter tersebut tanpa memasukkannya ke dalam
 * teks baru.
 * 
 * Kelemahan Indeks Statis (Hardcoding): Menuliskan angka batas potong secara
 * manual, seperti email.substring(0, 6), memiliki
 * risiko tinggi. Teks yang dimasukkan tidak selamanya sama (misal
 * budi@gmail.com atau andi.saputra@yahoo.com), sehingga angka
 * statis akan menghasilkan pemotongan yang keliru di masa depan.
 * 
 * Kombinasi Dinamis (indexOf): Untuk merancang fungsi pencari batas secara
 * otomatis, program dapat meminta bantuan indexOf("@")
 * untuk mendeteksi posisi pasti simbol @. Index dari karakter tersebut
 * selanjutnya dijadikan parameter endIndex dalam
 * pemotongan string. Ini menjamin substring dapat bekerja sempurna pada variasi
 * data apapun selama strukturnya konsisten.
 */