import java.time.LocalDate;

public class DatumCheck {
	private String datum;
	
	public LocalDate string2LocalDate(String datum) {
		
		String[] gesplitttet = datum.split("\\.");
		
		int tag = Integer.valueOf(gesplitttet[0]);
		int monat = Integer.valueOf(gesplitttet[1]);
		int jahr = Integer.valueOf(gesplitttet[2]);
		
		LocalDate date = LocalDate.of(jahr, monat, tag);
				
		return date;
	}

	public String getDatum() {
		return datum;
	}

	public void setDatum(String datum) {
		this.datum = datum;
	}
	
}
