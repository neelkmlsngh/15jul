package neel;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Converter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ArrayList<AirportPojo> airports = new ArrayList<AirportPojo>();

		BufferedReader br = new BufferedReader(
				new FileReader(new File("C:/Users/Training/Desktop/airport_list.csv")));
		String line = null;
		StringTokenizer st = null;
		AirportPojo airport = null;

		while ((line = br.readLine()) != null) {
			if (line != null) {

				st = new StringTokenizer(line, ",");
				airport = new AirportPojo();

				while (st.hasMoreTokens()) {
					// System.out.println(st.nextToken() +"-"+st.nextToken()+"-"+st.nextToken()+"-"+st.nextToken());
					airport.setCity(st.nextToken());
					airport.setAirportName(st.nextToken());
					airport.setICAO(st.nextToken());
					airport.setIATA(st.nextToken());
				}
			}

			airports.add(airport);

		}
		System.out.println(airports);
	}

	@Override
	public String toString() {
		AirportPojo apj = new AirportPojo();
		return "City : " + apj.getCity() + " Airport Name : " + apj.getAirportName() + " ICAO : " + apj.getICAO()
				+ " IATA : " + apj.getIATA();
	}

}