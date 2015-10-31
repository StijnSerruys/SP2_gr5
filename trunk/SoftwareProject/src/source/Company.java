package source;

public class Company {
	public Company(int companyNr, String name, String active) {
		super();
		this.companyNr = companyNr;
		this.name = name;
		this.active = active;
	}
	private int companyNr;
	private String name, active;
	public int companyNr() {
		return companyNr;
	}
	public void setcompanyNr(int companyNr) {
		this.companyNr = companyNr;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {this.name = name;	}
	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
	}
}
