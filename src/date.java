import java.util.Date;

public class date {
    public static void main (String[] args){
        Date today = new Date();

        System.out.print(String.format("Tgl/Jam : %tc", today));

    }
}
