package headfirst.designpatterns.factory.challenge;

public class ZoneFactory {
	public Zone createZone(String zoneId) {
		Zone zone = null;
		if (zoneId.equals("US/Pacific")) {
			zone = new ZonePacific();
		}
		else if (zoneId.equals("US/Mountain")) {
			zone = new ZoneMountain();
		}
		else if (zoneId.equals("US/Central")) {
			zone = new ZoneCentral();
		}
		else if (zoneId.equals("US/Eastern")) {
			zone = new ZoneEastern();
		}
		return zone;
	}
}