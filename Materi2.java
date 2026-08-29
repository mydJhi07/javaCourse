public class Materi2 {
    public static void main(String[] args) {

        // 1. Integer (int) - Bilangan bulat
        int age = 30;
        int year = 2025;
        int quantity = 1;

        System.out.println("You are " + age + " years old");
        System.out.println("The year is " + year);

        // 2. Double - Bilangan desimal
        double price = 19.99;
        double gpa = 3.5;
        double temperature = 12.5;

        System.out.println("The price is $" + price);
        System.out.println("Your GPA is " + gpa);

        // 3. Character (char) - Karakter tunggal (kutip tunggal)
        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        System.out.println("Your average letter grade is " + grade);

        // 4. Boolean - true atau false
        boolean isStudent = true;
        boolean forSale = false;

        // Menggunakan boolean di dalam percabangan If-Else
        if (isStudent) {
            System.out.println("You are a student");
        } else {
            System.out.println("You are not a student");
        }

        // 5. String - Serangkaian karakter/teks (kutip ganda)
        String name = "Bro Code";
        String food = "pizza";
        String email = "fake123@gmail.com";
        String car = "Mustang";
        String color = "red";

        System.out.println("Hello " + name);
        System.out.println("Your favorite food is " + food);
        System.out.println("Your email is " + email);

        // Menggabungkan beberapa variabel dalam satu kalimat
        System.out.println("Your choice is a " + color + " " + year + " " + car);
    }
}

/*
 * Deklarasi & Inisialisasi: Variabel dapat dibuat (menentukan tipe data dan
 * nama) sekaligus diisi dengan nilainya dalam satu
 * baris perintah (contoh: int age = 30;).
 * 
 * Penggabungan Teks (Concatenation): Simbol + pada perintah cetak
 * (System.out.println) berfungsi untuk merangkai teks statis
 * dengan isi variabel menjadi satu kalimat utuh.
 * 
 * Pemberian Spasi: Spasi antar kata tidak ditambahkan secara otomatis oleh
 * sistem, sehingga tanda kutip berspasi (" ") wajib
 * disisipkan secara manual di antara variabel agar teks tidak menyatu.
 * 
 * Evaluasi Kondisi: Variabel boolean dapat digunakan langsung sebagai syarat di
 * dalam blok if. Nilai true atau false dari
 * variabel tersebut akan langsung mengarahkan program untuk mengeksekusi blok
 * if atau beralih ke else.
 */