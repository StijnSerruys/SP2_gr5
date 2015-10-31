package source;

import gui.Loginscr;


public class Login extends Loginscr  {

	public Login(int id, int i, String companyName, String password, String hashcode, String user, int j) {
		super();
		this.id = id;
		this.user = user;
		this.companyName = companyName;
		this.password = password;
		this.hashcode = hashcode;
	}
	private int id;
	private String companyName;
	private String password;
	private String hashcode;
	private String user;

	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBedrijfsnaam() {
		return companyName;
	}
	public void setBedrijfsnaam(String companyName) {
		this.companyName = companyName;
	}
	public String getPaswoord() {
		return password;
	}
	public void setPaswoord(String password) {
		this.password = password;
	}
	public String getHashcode() {
		return hashcode;
	}
	public void setHashcode(String hashcode) {
		this.hashcode = hashcode;
	}
}
