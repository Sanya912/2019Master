package automationWithDB;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class CalendarDateFormat {

	public static void main(String[] args) {
		
		LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM dd yyyy");
        String formatDateTime = now.format(formatter);
        System.out.println("Today : " + formatDateTime +"\n***********************************");
        
        //*******************
        SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
    	String date = sdf.format(new Date()); 
    	System.out.println(date);
//***********************
    	System.out.println("***********************************");
    	Calendar calendar = Calendar.getInstance();
        //Date dates =  calendar.getTime();
    	SimpleDateFormat sd = new SimpleDateFormat("dd/M/yyyy");
    	System.out.println(sd.format(calendar.getTime()));
    	System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
    	System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
    	System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
	}

}
