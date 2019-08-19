import Employee.java;

public class CreatePeople {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Employee emp = new Employee("JohnDoe", "987867676",101,85000, "Software Engineer");
        System.out.println(emp.getName());
        System.out.println(emp.getMobile());  // 1. they are public and 2. we extended Person class
        System.out.println(emp.getEmpno());
        System.out.println(emp.getRole());
        System.out.println(emp.getSalary());
        System.out.println(emp);  
        
        
        HourlyEmployee hemp = new HourlyEmployee("Jennifer Atkinson","945445454",102,200, 25.75);
        
        System.out.println(hemp.getName());
        System.out.println(hemp.getMobile());  // 1. they are public and 2. we extended Person class
        System.out.println(hemp.getEmpno());
        System.out.println(hemp.getHourlyRate());
        System.out.println(hemp.getHours());
        System.out.println("Wages paid  =" + hemp.getHourlyRate()* hemp.getHours());
        System.out.println(hemp);

	}

}
