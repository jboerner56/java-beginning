import java.io.Serializable;

public class Employee extends Person implements Serializable {
    // all non-private members of super class are inherited by sub class
        
        private int empno;
        private double salary;
        private String role;
        public Employee() {
            // TODO Auto-generated constructor stub
        }
        public Employee(String name, String mobileNo, int empno, double salary, String role) {
            super(name,mobileNo);/// the runtime is going to call the super class two par
            // constructor chaining
            this.empno = empno;
            this.salary = salary;
            this.role = role;
        }
        public int getEmpno() {
            return empno;
        }
        public void setEmpno(int empno) {
            this.empno = empno;
        }
        public double getSalary() {
            return salary;
        }
        public void setSalary(double salary) {
            this.salary = salary;
        }
        public String getRole() {
            return role;
        }
        public void setRole(String role) {
            this.role = role;
        }
        
        @Override
        public String toString() {
            // TODO Auto-generated method stub
            return   "Employee Class Object "; //super.toString();
        }
        
        
    }
    