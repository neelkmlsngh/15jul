package neel;
public class AirportPojo {
	private String City;
	private String AirportName;
	private String ICAO;
	private String IATA;

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getAirportName() {
		return AirportName;
	}

	public void setAirportName(String airportName) {
		AirportName = airportName;
	}

	public String getICAO() {
		return ICAO;
	}

	public void setICAO(String iCAO) {
		ICAO = iCAO;
	}

	public String getIATA() {
		return IATA;
	}

	public void setIATA(String iATA) {
		IATA = iATA;
	}

	@Override
	public String toString() {
		return "AirportPojo [City=" + City + ", AirportName=" + AirportName + ", ICAO=" + ICAO + ", IATA=" + IATA + "]";
	}
	
}