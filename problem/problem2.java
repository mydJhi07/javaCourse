package problem;

import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double c;
        double f;
        double k;

        c = scan.nextInt();

        scan.nextLine(); // mencegah buffer input

        f = c * (9 / 5) + 32;
        k = c + 273.15;

        System.out.println(c + " Celsius = " + f + " Fahrenheit = " + k + " Kelvin");

        scan.close();
    }
}
