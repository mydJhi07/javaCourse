
package problem;

public class problem1 {
    public static void main(String[] args) {

        String nama = "Muhammad Yudha Damanhuri";
        char inisial = 'Y';
        int umur = 19;
        double tinggi = 165.20;
        boolean status = true;

        System.out.println("Perkenalkan, namaku " + nama + " (inisial " + inisial + " )," + " umur " + umur
                + " tahun dengan tinggi " + tinggi + ".");
        if (status == true) {
            System.out.println("Status: mahasiswa aktif.");
        } else {
            System.out.println("Status: mahasiswa tidak aktif.");
        }
    }
}
