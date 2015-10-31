package source;

public class Employee extends Person{
	   private int id;
	   private int salary;

	   public Employee(int nr, int age, String firstName, String lastName, int salary) {
		   super(nr, age, firstName, lastName);
	      this.salary = salary;
	   }
	   public int getId() {
	      return id;
	   }
	   public void setId( int id ) {
	      this.id = id;
	   }
	   public int getSalary() {
	      return salary;
	   }
	   public void setSalary( int salary ) {
	      this.salary = salary;
	   }
	}