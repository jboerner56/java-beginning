
public class Person {
	
	private String name;  // no  for identity, employee, consultant, manager, CEO, Sales
	private String mobile;
	public Person() {
	}
	
	
	public Person(String name, String mobile) {
		super();
		this.name = name;
		this.mobile = mobile;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	

}
