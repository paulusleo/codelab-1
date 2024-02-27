import java.util.Scanner;

public class Tugas1 {

    public static void main(String[] args){
        Tugas1 login = new Tugas1();
        Scanner input = new Scanner(System.in);

        System.out.println("====== Library System ======");
        System.out.println("1. Login  Mahasiswa");
        System.out.println("2. Login Admin");
        System.out.println("3. Keluar");
        System.out.print("Pilih opsi (1-3): ");
        int pilih = input.nextInt();

        switch (pilih){
            case 1:
                System.out.print("Masukkan NIM: ");
                long nim = input.nextLong();
                login.Mahasiswa(nim);
                break;
            case 2:
                System.out.print("Masukkan username: ");
                String user = input.next();
                System.out.print("Masukkan password: ");
                String pass = input.next();
                login.Admin(user,pass);
                break;
            case 3:
                break;
            default:
                System.out.println("Inputan anda salah!!!");
                break;
        }
    }
    void Mahasiswa(long num){
        long Nim[] = {20231037031117L, 202310370311212L, 202310370311100L};
        for (int i = 0; i < 3; i++){
            if (Nim[i] == num){
                System.out.println("Berhasil Login Sebagai Mahasiswa.");
                break;
            } else {
                System.out.println("Gagal Login.");
                break;
            }
        }
    }

    void Admin(String user, String password){
        String admn = "admin";
        String pwd = "admin123";

        if (admn.equals(user) && pwd.equals(password)){
            System.out.println("Berhasil Login sbg Admin");
        } else {
            System.out.println("Gagal login.");
        }
    }


}