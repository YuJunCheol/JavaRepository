package Y2020_09_16;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Day_Of_The_Week extends Exception{
	
	public static void main(String[] args) {
		try {
			System.out.println(week("2020-09-16"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static String week(String date) throws ParseException {
		String day = "" ;
	     
	    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd") ;
	    Date nDate = dateFormat.parse(date) ;
	     
	    Calendar cal = Calendar.getInstance() ;
	    cal.setTime(nDate);
	     
	    int dayNum = cal.get(Calendar.DAY_OF_WEEK) ;
	     
	     
	     
	    switch(dayNum){
	        case 1:
	            day = "��";
	            break ;
	        case 2:
	            day = "��";
	            break ;
	        case 3:
	            day = "ȭ";
	            break ;
	        case 4:
	            day = "��";
	            break ;
	        case 5:
	            day = "��";
	            break ;
	        case 6:
	            day = "��";
	            break ;
	        case 7:
	            day = "��";
	            break ;
	             
	    }
	     
	     
	     
	    return day ;

	}
}
