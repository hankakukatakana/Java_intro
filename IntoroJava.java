import java.util.Date;
import java.util.Calendar;
import java.time.LocalDateTime;

class say{
    public static void main(String[] args){
        Calendar CTime = Calendar.getInstance();
        Date DTime = new Date();
        LocalDateTime LTime = LocalDateTime.now();
        
        System.out.println(CTime);
        System.out.println(DTime);
        System.out.println(LTime);

        System.out.println("Good morning");
        System.out.println("Good afternoon");
        System.out.println("Good evening");
    }
}