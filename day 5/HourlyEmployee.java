public class HourlyEmployee extends Person {
	private int empno;
	private double hours;
	private double hourlyRate;

	public HourlyEmployee() {
		// TODO Auto-generated constructor stub
	}

	public HourlyEmployee(String name, String mobileNo,int empno, double hours, double hourlyRate) {
		super(name, mobileNo);
		this.empno = empno;
		this.hours = hours;
		this.hourlyRate = hourlyRate;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
}
