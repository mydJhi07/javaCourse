public class Materi28 {
    
    // ==============================================================
    // 1. Variabel Kelas (Class Scope/Global)
    // ==============================================================
    // Variabel ini dideklarasikan di luar method, namun masih di dalam class.
    // Karena diberi kata kunci 'static', ia bisa dibaca oleh method 'main' maupun method lain yang static.
    // Ibaratnya variabel ini ada di "jalan raya" sehingga semua "rumah" (method) di sekitarnya bisa melihat.
    static int x = 3;

    public static void main(String[] args) {
        
        System.out.println("--- Variabel Kelas (Global) ---");
        // Output: 3 (Mengambil dari 'static int x = 3' di atas)
        System.out.println("Nilai X di jalan raya (Class Scope): " + x);

        // ==============================================================
        // 2. Variabel Lokal (Local Scope) dalam Method Main
        // ==============================================================
        // Variabel lokal dideklarasikan DI DALAM method.
        // Meski namanya sama-sama 'x', variabel ini adalah wujud yang BERBEDA dari 'x' di atas.
        // Jika ada konflik nama, Java akan mengutamakan Variabel Lokal terlebih dahulu!
        int x = 1;

        System.out.println("\n--- Variabel Lokal (Main Method) ---");
        // Output: 1 (Mengutamakan variabel lokal dalam rumah/method main)
        System.out.println("Nilai X di dalam rumah Main: " + x);

        // Memanggil method doSomething
        doSomething();
    }

    // ==============================================================
    // 3. Variabel Lokal (Local Scope) dalam Method Lain
    // ==============================================================
    static void doSomething() {
        
        // Ini adalah variabel lokal khusus untuk method doSomething().
        // Method main() tidak akan pernah tahu keberadaan 'x = 2' ini.
        int x = 2;

        System.out.println("\n--- Variabel Lokal (doSomething Method) ---");
        // Output: 2
        System.out.println("Nilai X di dalam rumah doSomething: " + x);
    }
}

/*
    Variable Scope (Jangkauan Variabel) mengatur di mana sebuah variabel bisa diakses atau dikenali oleh sistem. Dalam videonya, 
    konsep ini dianalogikan dengan cemerlang layaknya perumahan dan jalanan.

    Local Scope (Rumah Terisolasi): Variabel yang dideklarasikan di dalam tanda kurung kurawal {} dari sebuah method (misal 
    dalam method main atau doSomething) memiliki ruang lingkup local. Anggap saja setiap method adalah sebuah rumah. Variabel 
    int x = 1; di dalam method main adalah milik penghuni rumah tersebut. Method doSomething() (rumah tetangga) tidak bisa 
    mengintip atau memakai variabel x = 1 tersebut. Itulah sebabnya sah-sah saja jika rumah doSomething() membuat variabel 
    dengan nama yang persis sama, yakni int x = 2;. Keduanya tidak saling bentrok karena terisolasi.

    Class Scope (Fasilitas di Jalan Raya): Variabel yang diciptakan langsung di bawah nama class tapi masih di luar method 
    (misal static int x = 3;) disebut class variable atau variabel global. Ibaratnya, variabel ini adalah tiang lampu di jalan 
    raya. Semua penghuni rumah (main() dan doSomething()) bisa menengok ke jendela dan melihat variabel ini, serta dapat 
    memakainya.

    Konflik Nama (Shadowing): Apa yang terjadi jika ada dua variabel bernama x? (Satu di class scope dan satu lagi local scope).
    Hukum dalam Java adalah: "Utamakan yang paling dekat". Jika di dalam method main ada int x = 1;, maka ketika kamu 
    memerintahkan System.out.println(x), program akan mengabaikan nilai 3 (yang ada di jalan raya) dan memprioritaskan nilai 1 
    (milik pribadi di dalam method itu). Hal ini disebut Shadowing, di mana variabel lokal menutupi eksistensi variabel global.
*/