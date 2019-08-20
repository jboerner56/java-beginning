public class CreatePeople {

	public static void main(String[] args) {
        // TODO Auto-generated method stub
        // class relation and object relation
        Person p = new Person("some person", "11111");

        Employee emp = new Employee("JohnDoe", "987867676",101,85000, "Software Engineer");

        boolean same = (p == emp);
            // p and emp are class objects
        String str = new String("hi");
        // same = (p == str);

        Object obj = new Object();
        same = (obj == str);
                            // object
        // person extends the object    string is sibling with person. not compatible with each other
                // person                   string

                // employee                 

        // System.out.println(emp.getName());
        // System.out.println(emp.getMobile());  // 1. they are public and 2. we extended Person class
        // System.out.println(emp.getEmpno());
        // System.out.println(emp.getRole());
        // System.out.println(emp.getSalary());
        // System.out.println(emp);  
        
        // HourlyEmployee hemp = new HourlyEmployee("Jennifer Atkinson","945445454",102,200, 25.75);
        
        // System.out.println(hemp.getName());
        // System.out.println(hemp.getMobile());  // 1. they are public and 2. we extended Person class
        // System.out.println(hemp.getEmpno());
        // System.out.println(hemp.getHourlyRate());
        // System.out.println(hemp.getHours());
        // System.out.println("Wages paid  =" + hemp.getHourlyRate()* hemp.getHours());
        // System.out.println(hemp);

	}

}
