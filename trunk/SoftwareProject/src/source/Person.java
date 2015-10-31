package source;

public class Person {
	public Person(int nr, int age, String firstName, String lastName) {
		super();
		this.nr = nr;
		this.age = age;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	private int nr, age;
	private String firstName, lastName;
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getNr() {
		return nr;
	}
	public void setNr(int nr) {
		this.nr = nr;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

}
