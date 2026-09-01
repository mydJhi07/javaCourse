package problem;

import java.util.Scanner;

public class problem5 {
    public static void main() {
        Scanner scan = new Scanner(System.in);

        String nama = "";
        double harga = 0;
        double diskon = 0;
        double total = 0;
        int jumlah = 0;

        System.out.println("Menu:");
        System.out.println("1. Senin");
        System.out.println("2. Selasa");
        System.out.println("3. Rabu:");
        System.out.println("4. Kamis");
        System.out.println("5. Jumat");
        System.out.println("6. Sabtu");
        System.out.println("7. Minggu");
        System.out.print("Pilih menu: ");
        int pilihan = scan.nextInt();
        scan.nextLine();

        switch (pilihan) {
            case 1, 2, 3, 4, 5 -> {
                diskon = 20.0 / 100.0;
                System.out.print("Nama barang: ");
                nama = scan.nextLine();
                System.out.print("Harga " + nama + ": ");
                harga = scan.nextDouble();
                System.out.print("Jumlah " + nama + " yang ingin dibeli: ");
                jumlah = scan.nextInt();

                total = Math.round(harga * jumlah * (1 - diskon));

                System.out.printf("===== STRUK BELANJA =====\n", total);
                System.out.printf("Nama barang:\t%s\n", nama);
                System.out.printf("Harga:\t%.2f\n", harga);
                System.out.printf("Jumlah:\t%d\n", jumlah);
                System.out.printf("Harga:\t%.2f\n", harga);
                System.out.printf("Total:\t%.2f\n", total);
            }
            case 6, 7 -> {
                diskon = 50.0 / 100.0;
                System.out.print("Nama barang: ");
                nama = scan.nextLine();
                System.out.print("Harga " + nama + ": ");
                harga = scan.nextDouble();
                System.out.print("Jumlah " + nama + " yang ingin dibeli: ");
                jumlah = scan.nextInt();

                total = Math.round(harga * jumlah * (1.0 - diskon));

                System.out.printf("\n===== STRUK BELANJA =====\n", total);
                System.out.printf("Nama barang: %s\t\n", nama);
                System.out.printf("Harga:\t%.2f\n", harga);
                System.out.printf("Jumlah:\t%d\n", jumlah);
                System.out.printf("Harga:\t%.2f\n", harga);
                System.out.printf("Total:\t%.2f\n", total);
            }

        }

    }
}
