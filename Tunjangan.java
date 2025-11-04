import java.util.Scanner;

public class Tunjangan{

    public static double hitungTunjangan(double gajiKotor, int jumlahAnak) {
        if (jumlahAnak < 3) {
            return 0.2 * gajiKotor;
        } else {
            return 0.3 * gajiKotor;
        }
    }
     public static void tampilkanTunjangan(double gajiKotor, int jumlahAnak) {
        double tunjangan = hitungTunjangan(gajiKotor, jumlahAnak);
        System.out.println("==HASIL PERHITUNGAN==");
        System.out.println("Jumlah anak        : " + jumlahAnak);
        System.out.println("Gaji kotor         : Rp " + gajiKotor);
        System.out.println("Tunjangan diterima : Rp " + tunjangan);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan gaji kotor: ");
        double gaji = input.nextDouble();

        System.out.print("Masukkan jumlah anak: ");
        int anak = input.nextInt();

        tampilkanTunjangan(gaji, anak);

        input.close();
    }
    
}
