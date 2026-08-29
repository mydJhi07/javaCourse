import java.util.Scanner;

public class Materi4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.print("Masukkan sebuah kata sifat (mendeskripsikan sesuatu): ");
        adjective1 = scan.nextLine();

        System.out.print("Masukkan sebuah kata benda (manusia atau hewan): ");
        noun1 = scan.nextLine();

        System.out.print("Masukkan sebuah kata sifat (mendeskripsikan sesuatu): ");
        adjective2 = scan.nextLine();

        System.out.print("Masukkan sebuah kata kerja aksi: ");
        verb1 = scan.nextLine();

        System.out.print("Masukkan sebuah kata sifat (mendeskripsikan sesuatu): ");
        adjective3 = scan.nextLine();

        System.out.println("Hari ini aku mau ke kebun binatang yang " + adjective1);
        System.out.println("Pada sebuah pameran, aku melihat " + noun1 + ".");
        System.out.println(noun1 + " " + adjective2 + " and " + verb1 + "!");
        System.out.println("Saya " + adjective3 + ".");

    }
}
