package problem;

import java.util.Random;

public class problem4 {
    public static void main(String[] args) {

        Random rand = new Random();

        int dadu = 0;

        int sisi1 = 0;
        int sisi2 = 0;
        int sisi3 = 0;
        int sisi4 = 0;
        int sisi5 = 0;
        int sisi6 = 0;

        for (int i = 0; i < 10000; i++) {
            dadu = rand.nextInt(1, 7);

            if (dadu == 1) {
                sisi1++;
            } else if (dadu == 2) {
                sisi2++;
            } else if (dadu == 3) {
                sisi3++;
            } else if (dadu == 4) {
                sisi4++;
            } else if (dadu == 5) {
                sisi5++;
            } else if (dadu == 6) {
                sisi6++;
            }
        }

        float presentase1 = (sisi1) / 100;
        float presentase2 = (sisi2) / 100;
        float presentase3 = (sisi3) / 100;
        float presentase4 = (sisi4) / 100;
        float presentase5 = (sisi5) / 100;
        float presentase6 = (sisi6) / 100;

        System.out.println("Sisi 1 = " + sisi1 + " (" + Math.round(presentase1) + "%) kali");
        System.out.println("Sisi 2 = " + sisi2 + " (" + Math.round(presentase2) + "%) kali");
        System.out.println("Sisi 3 = " + sisi3 + " (" + Math.round(presentase3) + "%) kali");
        System.out.println("Sisi 4 = " + sisi4 + " (" + Math.round(presentase4) + "%) kali");
        System.out.println("Sisi 5 = " + sisi5 + " (" + Math.round(presentase5) + "%) kali");
        System.out.println("Sisi 6 = " + sisi6 + " (" + Math.round(presentase6) + "%) kali");

    }
}
