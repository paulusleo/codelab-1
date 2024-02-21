import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class DataDiri{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan Jenis Kelamin (P/L): ");
        char jenisKelamin = input.next().charAt(0);
        String jenisKelaminStr = (jenisKelamin == 'P' || jenisKelamin == 'p') ? "Perempuan" : "Laki-laki";

        System.out.print("Masukkan Tanggal Lahir (yyyy-mm-dd): ");
        String tanggalLahirStr = input.next();
        LocalDate tanggalLahir = LocalDate.parse(tanggalLahirStr);

        LocalDate today = LocalDate.now();
        Period period = Period.between(tanggalLahir, today);
        int umur = period.getYears();
        int bulan = period.getMonths();

        // Output data diri
        System.out.println("\n=== Data Diri Anda ===");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelaminStr);
        System.out.println("Tanggal Lahir: " + tanggalLahir);
        System.out.println("Umur: " + umur + " tahun " + bulan + " bulan");

        input.close();
    }
}