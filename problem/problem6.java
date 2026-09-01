package problem;

import java.util.Scanner;

public class problem6 {
    public static void main(String[] args) throws InterruptedException { // tambahan throws InterruptedException untuk
                                                                         // time delay

        Scanner scan = new Scanner(System.in);

        String nama = "";
        double berat = 0.0;
        double tinggi = 0.0;
        double bmi = 0.0;
        int usia = 0;
        String inisial = "";
        String klasifikasi = "";

        System.out.println("===== PROGRAM BMI (UNTUK USIA DEWASA) =====\n");

        System.out.print("Masukkan nama lengkap: ");
        nama = scan.nextLine();
        inisial = nama.substring(0, 3);

        System.out.print("Masukkan berat " + inisial + " (kg): ");
        berat = scan.nextDouble();

        System.out.print("Masukkan tinggi " + inisial + " (m): ");
        tinggi = scan.nextDouble();

        System.out.print("Masukkan usia " + inisial + ": ");
        usia = scan.nextInt();

        scan.nextLine();

        bmi = berat / Math.pow(tinggi, 2);

        if (usia >= 19) {
            if (bmi < 18.5) {
                klasifikasi = "Kekurangan berat badan";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                klasifikasi = "Normal";
            } else if (bmi >= 24.9 && bmi < 29.9) {
                klasifikasi = "Kelebihan berat badan";
            } else if (bmi >= 29.9) {
                klasifikasi = "Obesitas";
            }
        }

        System.out.println("Sedang Proses...");

        Thread.sleep(1000);

        System.out.println("25%.");

        Thread.sleep(1000);

        System.out.println("50%..");

        Thread.sleep(1000);

        System.out.println("100%...\n\n");

        System.out.println("Hasilnya: " + klasifikasi + "\n");
        System.out.println("Nama: " + nama + " (Inisial " + inisial + ")");
        System.out.println("Berat: " + berat + " kg");
        System.out.println("Tinggi: " + tinggi + " m");
        System.out.println("usia: " + usia + " tahun");
        System.out.printf("BMI: %.2f\n\n", bmi);

        switch (klasifikasi) {
            case "Kekurangan berat badan" -> {
                System.out.println("\nRekomendasi untuk anda:\n");
                System.out.println("Pola makan: Fokus menambah kalori & protein secara sehat");
                System.out.println("Olahraga: Latihan kekuatan + aktivitas ringan/sedang");
                System.out.println("Pola tidur: Tidur pada 7 hingga 9 jam");
            }
            case "Normal" -> {
                System.out.println("\nRekomendasi untuk anda:\n");
                System.out.println("Pola makan: Pola makan seimbang & pertahankan berat");
                System.out.println("Aktivitas rutin + latihan kekuatan");
                System.out.println("Pola tidur: Tidur pada 7 hingga 9 jam");
            }
            case "Kelebihan berat badan" -> {
                System.out.println("\nRekomendasi untuk anda:\n");
                System.out.println("Pola makan: Defisit kalori ringan, makanan bergizi tinggi");
                System.out.println("Olahraga: Kardio + latihan kekuatan");
                System.out.println("Pola tidur: Tidur pada 7 hingga 9 jam");
            }
            case "Obesitas" -> {
                System.out.println("\nRekomendasi untuk anda:\n");
                System.out.println("Pola makan: Kardio + latihan kekuatan");
                System.out.println("Olahraga: Mulai bertahap, kardio low-impact + kekuatan");
                System.out.println("Pola tidur: Tidur pada 7 hingga 9 jam");
            }
        }

        System.out.println("\n\nTERIMA KASIH");

        scan.close();

    }
}
