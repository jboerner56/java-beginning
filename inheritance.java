public class Person {
    private String name;
    private String phoneNum;

    public Person(String name, String phoneNum) {
        this.name = name;
        this.phoneNum = phoneNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

}

public class Employee extends Person {

    public Employee(String name, String phoneNum) {
        super(name, phoneNum);
        // TODO Auto-generated constructor stub
    }

}
public class CreatePeople {
    public static void main(String[] args) {
        Employee emp = new Employee();
        System.out.println(emp.getName());
        System.out.println(emp.getPhoneNum());
    }
}