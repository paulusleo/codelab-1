import java.util.Scanner;
public class latihan1 {
    private static Object system;

    public static void main(String[] args)
    {
        //objek dr class scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan nama jurusan di UMM : ");
        //panggil method text
        String jurusan = sc.next();
        System.out.println("Nama jurusan :" +jurusan );
        
        //deklrasi variable
        int population = 100000;
        String nama = "informatika";
        char kar = 'a';

        //output
        System.out.println("populasinya :" + population );
        System.out.println("jurusan : "+ nama + "\nKarakter : " + kar);
    }
}
