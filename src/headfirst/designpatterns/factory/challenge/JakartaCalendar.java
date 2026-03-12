package headfirst.designpatterns.factory.challenge;

import java.util.*;

public class JakartaCalendar extends Calendar {

	public JakartaCalendar() {
		// Calendar() constructor automatically calls createZone()
	}

	@Override
	public Zone createZone() {
		return new ZoneJakarta();
	}

	@Override
	public void createCalendar(List<String> appointments) {
		// make calendar from appointments
		System.out.println("Making the Jakarta calendar");
	}
}
