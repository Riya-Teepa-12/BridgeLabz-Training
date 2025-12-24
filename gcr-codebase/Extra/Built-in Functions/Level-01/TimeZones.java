import java.time.ZonedDateTime;
import java.time.ZoneId;

public class TimeZones{

	public static void main(String[] args) {
	
	    //defining a variable of type ZonedDateTime
        ZonedDateTime gmt=ZonedDateTime.now(ZoneId.of("GMT"));
		System.out.println("Current Time in GMT: "+gmt);

	      //defining a variable of type ZonedDateTime
		ZonedDateTime ist=ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
		System.out.println("Current Time in IST: "+ist);

         //defining a variable of type ZonedDateTime
		ZonedDateTime pst=ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
		System.out.println("Current Time in PST: "+pst);
	}
}