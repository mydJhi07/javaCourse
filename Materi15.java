import java.util.Scanner;

public class Materi15 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Deklarasi variabel
        double weight;
        double newWeight;
        int choice;

        // Menampilkan menu pilihan
        System.out.println("Weight Conversion Program");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");
        System.out.print("Choose an option: ");
        choice = scanner.nextInt();

        // Pengecekan kondisi berdasarkan input menu (1 atau 2)
        if (choice == 1) {
            System.out.print("Enter the weight in lbs: ");
            weight = scanner.nextDouble();

            // Rumus konversi Pound (lbs) ke Kilogram (kgs)
            newWeight = weight * 0.453592;

            System.out.printf("The new weight in kgs is: %.2f kgs\n", newWeight);
        } else if (choice == 2) {
            System.out.print("Enter the weight in kgs: ");
            weight = scanner.nextDouble();

            // Rumus konversi Kilogram (kgs) ke Pound (lbs)
            newWeight = weight * 2.20462;

            System.out.printf("The new weight in lbs is: %.2f lbs\n", newWeight);
        } else {
            // Dieksekusi jika pengguna memasukkan angka selain 1 atau 2
            System.out.println("That was not a valid choice.");
        }

        scanner.close();
    }
}