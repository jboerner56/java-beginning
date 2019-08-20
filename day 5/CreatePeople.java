public class CreatePeople {

	public static void main(String[] args) {
        // class relation and object relation
        Person p = new Person("some person", "11111");

        Employee emp = new Employee("JohnDoe", "987867676",101,85000, "Software Engineer");

        // boolean same = (p == emp);
            // p and emp are class objects
        // String str = new String("hi");
        // same = (p == str);

        // Object obj = new Object();
        // same = (obj == str);
                            // object
        // person extends the object    string is sibling with person. not compatible with each other
                // person                   string

                // employee                 

            p = emp; // assigning sub class reference to superclass

            // emp = p;
            // not allowed
                // person (p) is bigger than emp. type mismatch. person is parent of employee
            // int i = 0;
            // byte b = i;
        
        System.out.println(p.toString());
        p = new HourlyEmployee("name", "empno", 100, 100, 100);
        System.out.println(p);
        p=emp;
        System.out.println(p.getName()); // p refers to Person or Employee, or HourlyEmployee
        // will print out employee name from top bc it p(person) was set to emp(employee)
	}

}
