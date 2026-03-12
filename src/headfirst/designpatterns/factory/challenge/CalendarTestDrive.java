package headfirst.designpatterns.factory.challenge;

import java.util.*;

public class CalendarTestDrive {
 
	public static void main(String[] args) {
		List<String> appts = Arrays.asList("appt 1", "appt 2");

		// Factory Method: each Calendar subclass creates its own Zone
		Calendar pacific = new PacificCalendar();
		pacific.createCalendar(appts);
		pacific.print();

		System.out.println();

		Calendar jakarta = new JakartaCalendar();
		jakarta.createCalendar(appts);
		jakarta.print();
	}
}
