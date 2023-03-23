
public class Main {

    public static void main(String[] args) {
        // проверка работы программы 
        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.allEmployeesAndFullInformation();
        employeeBook.departmentInformation("1");
        employeeBook.moreSalary(10000);
        employeeBook.deleteEmployee("Тушков","Юрий","Ярославович",9);
        employeeBook.allEmployeesAndFullInformation();
        employeeBook.newEmployee("Петров","Дмитрий","Евгеньевич","2",60000);
        employeeBook.allEmployeesAndFullInformation();
        employeeBook.departmentFullInformation();
        employeeBook.moreSalary(10000);
        employeeBook.maxSalary();
        employeeBook.minSalary();
    }
}
