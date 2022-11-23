import java.util.Date;
import java.time.LocalDateTime;

class say{
    public static void main(String[] args){
        Date DTime = new Date();
        LocalDateTime LTime = LocalDateTime.now();

        System.out.println(DTime);
        System.out.println(LTime);
        System.out.println("Good morning");
        System.out.println("Good afternoon");
        System.out.println("Good evening");
    }
}