
package hrapp;

/**
 *
 * @author mattpinkerton
 */
public class HRApp {
    static int x = 10;
    static void hi() {

        switch (x){

            
            case 2: case 6: case 10:
                System.out.println(x);
                break;
            case 3,5,9:
                System.out.println(x);
                break;
            case 4:
                System.out.println(x);
                break;
            default:
                System.out.println("no match");
        }
    }
    public static void main(String[] args) {

hi();
        System.out.println("HRApp starts");

        Employee e1 = new Employee(230, "Jerry", 333998);
        Employee e2 = new Employee(420, "Gracie", 3392823);

        Department dept = new Department("Education");

        dept.addEmp(e1);
        dept.addEmp(e2);
        dept.addEmp(new Employee(772, "Jack", 2998));

        Employee[] emps = dept.getEmployees();

        for (Employee emp : emps) {
            System.out.println("Emp " + emp);
        }

        System.out.println("Total: " + dept.getTotalSalary());
        System.out.println("Average: " + dept.getAverageSalary());

        //testing employee search
        System.out.println("Emp " + dept.getEmployeeByID(420));
        System.out.println("Emp " + dept.getEmployeeByID(23122));

    }

}
