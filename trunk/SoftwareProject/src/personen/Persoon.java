package personen;

public class Persoon {
	public Persoon(int nr, int leeftijd, int adresID, String voornaam, String naam) {
		super();
		this.nr = nr;
		this.leeftijd = leeftijd;
		this.adresID = adresID;
		this.voornaam = voornaam;
		this.naam = naam;
	}
	private int nr, leeftijd, adresID;
	private String voornaam, naam;
	
	public String getNaam() {
		return naam;
	}
	public void setNaam(String naam) {
		this.naam = naam;
	}
	public int getNr() {
		return nr;
	}
	public void setNr(int nr) {
		this.nr = nr;
	}
	public int getLeeftijd() {
		return leeftijd;
	}
	public void setLeeftijd(int leeftijd) {
		this.leeftijd = leeftijd;
	}
	public int getAdresID() {
		return adresID;
	}
	public void setAdresID(int adresID) {
		this.adresID = adresID;
	}
	public String getVoornaam() {
		return voornaam;
	}
	public void setVoornaam(String voornaam) {
		this.voornaam = voornaam;
	}

}
