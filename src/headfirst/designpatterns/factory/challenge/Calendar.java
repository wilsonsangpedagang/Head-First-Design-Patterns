package headfirst.designpatterns.factory.challenge;

import java.util.*;

public abstract class Calendar {
	Zone zone;

	public Calendar() {
		zone = createZone();   // Factory Method – subclass decides which Zone to create
	}

	public abstract Zone createZone();  // << Factory Method

	public void print() {
		System.out.println("--- " + zone.getDisplayName() + " Calendar ---");
		// print all appointments in correct time zone
		System.out.println("Offset from GMT: " + zone.getOffset());
	}

	public abstract void createCalendar(List<String> appointments);
}