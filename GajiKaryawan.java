import java.util.Scanner;

public class GajiKaryawan {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input Golongan
        System.out.print("Masukkan Golongan (A/B/C): ");
        String golongan = input.nextLine();

        // Input Jam Lembur
        System.out.print("Masukkan Jam Lembur: ");
        int jam = input.nextInt();

        int gajiPokok = 0;
        double gajiLembur = 0;

        // Tentukan gaji pokok
        if (golongan.equals("A")) {
            gajiPokok = 5000000;
        } else if (golongan.equals("B")) {
            gajiPokok = 6500000;
        } else if (golongan.equals("C")) {
            gajiPokok = 9500000;
        } else {
            System.out.println("Golongan tidak valid");
            return;
        }

        // Tentukan gaji lembur
        if (jam == 1) {
            gajiLembur = gajiPokok * 0.30;
        } else if (jam == 2) {
            gajiLembur = gajiPokok * 0.32;
        } else if (jam == 3) {
            gajiLembur = gajiPokok * 0.34;
        } else if (jam == 4) {
            gajiLembur = gajiPokok * 0.36;
        } else if (jam >= 5) {
            gajiLembur = gajiPokok * 0.38;
        } else {
            gajiLembur = 0;
        }

        double total = gajiPokok + gajiLembur;

        // Output
        System.out.println("Jumlah Penghasilan: Rp " + total);
    }
}
