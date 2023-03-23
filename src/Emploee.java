public class Emploee { // класс для создания объекта работник 
    private static int number;
    private final int id;
    private String surname;
    private String name;
    private String patronymic;
    private String department;
    private int salary;

public Emploee(String surname, String name, String patronymic, String department, int salary){
    this.surname= surname;
    this.name=name;
    this.patronymic=patronymic;
    this.department=department;
    this.salary=salary;
    number++;
    this.id=getNumber();//присваивание каждому работнику личного номера 
}

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Emploee{" +
                "Фамилия='" + surname + '\'' +
                ", Имя='" + name + '\'' +
                ", Отчество='" + patronymic + '\'' +
                ", Отдел='" + department + '\'' +
                ", Зарплата=" + salary +
                '}';
    }

    private int getNumber() {
        return number;
    }
    public int getId(){
    return id;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

}
