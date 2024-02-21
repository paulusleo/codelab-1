import java.util.Date;

class jam {
    public static void main(String[] args){
        Date today = new Date();

        String str = String.format("Tgl/Jam : %tc", today);
        System.out.print(str);
    }
}
