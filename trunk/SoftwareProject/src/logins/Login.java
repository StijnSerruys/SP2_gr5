package logins;

public class Login  {
	public Login(int id, String bedrijfsnaam, String paswoord, String hashcode) {
		super();
		this.id = id;
		this.bedrijfsnaam = bedrijfsnaam;
		this.paswoord = paswoord;
		this.hashcode = hashcode;
	}
	private int id;
	private String bedrijfsnaam, paswoord, hashcode;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBedrijfsnaam() {
		return bedrijfsnaam;
	}
	public void setBedrijfsnaam(String bedrijfsnaam) {
		this.bedrijfsnaam = bedrijfsnaam;
	}
	public String getPaswoord() {
		return paswoord;
	}
	public void setPaswoord(String paswoord) {
		this.paswoord = paswoord;
	}
	public String getHashcode() {
		return hashcode;
	}
	public void setHashcode(String hashcode) {
		this.hashcode = hashcode;
	}
}
