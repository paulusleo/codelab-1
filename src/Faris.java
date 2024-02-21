import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Faris {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);

        //Masukkan data
        System.out.print("Masukkan nama: ");
        String name = input.nextLine();
        System.out.print("Masukkan jenis kelamin (P/L): ");
        String genderInput = input.nextLine();
        char gender = genderInput.toUpperCase().charAt(0);
        System.out.print("Masukkan tanggal lahir (yyyy-mm-dd: ");
        String DateOfBirthInput = input.nextLine();
        LocalDate DateOfBirth = LocalDate.parse(DateOfBirthInput);

        //Umur
        LocalDate sekarang = LocalDate.now();
        Period period = Period.between(DateOfBirth, sekarang);
        int umur = period.getYears();

        //Tampilan
        System.out.println("\nData diri;");
        System.out.println("Nama: "+name);
        System.out.println("Jenis Kelamin: "+ (gender ==  'L' ? "Laki-Laki" : "Perempuan"));
        System.out.println("Tanggal Lahir: "+ DateOfBirthInput);
        System.out.println("Umur: "+ umur + "Tahun");

        input.close();
    }

}
