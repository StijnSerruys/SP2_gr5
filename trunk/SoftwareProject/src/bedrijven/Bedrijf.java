package bedrijven;

public class Bedrijf {
	public Bedrijf(int bedrijfsNr, String naam, String actief) {
		super();
		this.bedrijfsNr = bedrijfsNr;
		this.naam = naam;
		this.actief = actief;
	}
	private int bedrijfsNr;
	private String naam, actief;
	public int getBedrijfsNr() {
		return bedrijfsNr;
	}
	public void setBedrijfsNr(int bedrijfsNr) {
		this.bedrijfsNr = bedrijfsNr;
	}
	public String getNaam() {
		return naam;
	}
	public void setNaam(String naam) {
		this.naam = naam;
	}
	public String getActief() {
		return actief;
	}
	public void setActief(String actief) {
		this.actief = actief;
	}
}
