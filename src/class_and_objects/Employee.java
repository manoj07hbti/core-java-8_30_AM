package class_and_objects;

public class Employee {

   // DATA Member
   String name="Raj";
   int age=25;
   String dept="CS";
   double salary=25000.67;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {

        //TODO   ClassName ObjName= new ClassName();


        Employee obj1= new Employee();
        Employee obj2= new Employee();
        Employee obj3= new Employee();

        System.out.println("Printing employee Name: "+obj1.name + " Age: "+obj1.age + " Dept: "+ obj1.dept + " Salary: "+obj1.salary);

    }
}
