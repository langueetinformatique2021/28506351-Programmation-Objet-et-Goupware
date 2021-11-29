package tp07;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateHeureCourante extends Date {
	Date d = new Date();
	public static void main(String[] args) {
		 Date date = new Date();
		 //int date2 = date.getDate();
		 System.out.println(date);
		 GregorianCalendar cal = new GregorianCalendar();
		 Date heure_creation = new Date();
		 System.out.println(heure_creation);
		 System.out.println(cal.get(Calendar.DATE));
		 System.out.println(cal.get(Calendar.MONTH));
		 System.out.println(cal.get(Calendar.YEAR));
		 //System.out.println(cal.creationTime());
		 //pour avoir date et heure création objet 
		 //Date trialtime = new Date();
		 //d.setTime(trialTime);

		 Date d = new Date();
		 cal.setTime(date);
		 System.out.println(cal);
		 System.out.println(d);
	}
	
	/*public void creer_cal(Date date_creation) {
		GregorianCalendar cal = new GregorianCalendar();
		date_creation = new Date();
		System.out.println(date_creation);
	}*/
}
