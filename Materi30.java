import java.util.Random;
import java.util.Scanner;

public class Materi30 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numOfDice;
        int total = 0;

        System.out.println("=========================================");
        System.out.println("        DICE ROLLER PROGRAM (ASCII)      ");
        System.out.println("=========================================");
        
        System.out.print("Enter the number of dice to roll: ");
        numOfDice = scanner.nextInt();

        // Validasi agar jumlah dadu lebih dari 0
        if (numOfDice > 0) {
            
            // Loop sebanyak jumlah dadu yang diminta
            for (int i = 0; i < numOfDice; i++) {
                // Menghasilkan angka acak antara 1 dan 6
                int roll = random.nextInt(6) + 1; 
                
                System.out.println("\n--- Dice " + (i + 1) + " ---");
                System.out.println("You rolled: " + roll);
                
                // Menampilkan ilustrasi dadu ASCII
                printDie(roll);
                
                // Menambahkan angka ke total
                total += roll; 
            }
            
            System.out.println("\n=========================================");
            System.out.println("TOTAL SUM: " + total);
            System.out.println("=========================================");

        } else {
            System.out.println("Number of dice must be greater than zero.");
        }

        scanner.close();
    }

    // Method terpisah untuk mencetak seni ASCII dari sebuah dadu
    static void printDie(int roll) {
        
        // Template untuk garis-garis sisi dadu (membantu DRY code)
        String topBottom = "-------";
        String emptyMid = "|     |";

        switch (roll) {
            case 1 -> {
                System.out.println(topBottom);
                System.out.println(emptyMid);
                System.out.println("|  •  |");
                System.out.println(emptyMid);
                System.out.println(topBottom);
            }
            case 2 -> {
                System.out.println(topBottom);
                System.out.println("| •   |");
                System.out.println(emptyMid);
                System.out.println("|   • |");
                System.out.println(topBottom);
            }
            case 3 -> {
                System.out.println(topBottom);
                System.out.println("| •   |");
                System.out.println("|  •  |");
                System.out.println("|   • |");
                System.out.println(topBottom);
            }
            case 4 -> {
                System.out.println(topBottom);
                System.out.println("| • • |");
                System.out.println(emptyMid);
                System.out.println("| • • |");
                System.out.println(topBottom);
            }
            case 5 -> {
                System.out.println(topBottom);
                System.out.println("| • • |");
                System.out.println("|  •  |");
                System.out.println("| • • |");
                System.out.println(topBottom);
            }
            case 6 -> {
                System.out.println(topBottom);
                System.out.println("| • • |");
                System.out.println("| • • |");
                System.out.println("| • • |");
                System.out.println(topBottom);
            }
            default -> System.out.println("Invalid roll!");
        }
    }
}