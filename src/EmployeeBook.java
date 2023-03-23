public class EmployeeBook {//класс для хранения и работы с данными сотрудника 
    private Emploee[] emploee = new Emploee[50];


    public void allEmployeesAndFullInformation() { // получение полной информации о всех сотрудниках
        for (int i = 0; i < emploee.length; i++) {
            if (emploee[i] != null) {
                System.out.println(emploee[i]);
            }
        }
    }

    public void departmentInformation(String department) { // получение полной информации о сотрудниках определенного отдела 
        System.out.println("Сотрудники отдела - " + department);
        for (int i = 0; i < emploee.length; i++) {
            if (emploee[i] != null && emploee[i].getDepartment().equals(department)) {

                System.out.println("ФИО: - " + emploee[i].getSurname() + " " + emploee[i].getName() + " " + emploee[i].getPatronymic() + " Зарплата:" + emploee[i].getSalary());
            }
        }
    }

    public int salaryExpenses() { //подсчет затрат на зарплаты всем сотрудникам 
        int sumSalary = 0;
        for (int i = 0; i < emploee.length; i++) {
            if (emploee[i] != null) {
                sumSalary = emploee[i].getSalary() + sumSalary;
            }
        }
        return sumSalary;
    }

    public int salaryExpensesForDepartment(String department) {//подсчет затрат на зарплаты всем сотрудникам одного отдела 
        int sumSalary = 0;
        for (int i = 0; i < emploee.length; i++) {
            if (emploee[i] != null && emploee[i].getDepartment().equals(department)) {
                sumSalary = emploee[i].getSalary() + sumSalary;
            }
        }
        return sumSalary;
    }

    public void averageSalary() { // средняя зарплата у сотрудника 
        int average;
        average = salaryExpenses();
        average = average / emploee.length;
        System.out.println(average);
    }

    public void averageSalaryForDepartment(String department) { // средняя заплата у сотрудника внутри одного отдела 
        int average;
        int amountOfWorkers = 0;
        for (int i = 0; i < emploee.length; i++) {
            if (emploee[i] != null && emploee[i].getDepartment().equals(department)) amountOfWorkers++;
        }
        average = salaryExpensesForDepartment(department);
        average = average / amountOfWorkers;
        System.out.println(average);
    }

    public void maxSalary() { //вывод сотрудника с самой большой зарплатой 
        boolean condition;
        for (int i = 0; i < emploee.length; i++) {
            if (emploee[i] != null) {
                condition = true;
                for (int j = 0; j < emploee.length; j++) {
                    if (emploee[j] != null && i != j) {
                        if (emploee[i].getSalary() > emploee[j].getSalary()) {
                        } else {
                            condition = false;

                        }
                    }
                }
                if (condition) {
                    System.out.println(" ФИО сотрудника с максимальной зарплатой: " + emploee[i].getSurname() + " " + emploee[i].getName() + " " + emploee[i].getPatronymic());
                    break;
                }
            }
        }
    }

    public void maxSalaryDepartment(String department) { //вывод сотрудника с максивальной зарплатой среди одного отдела 
        boolean condition;
        for (int i = 0; i < emploee.length; i++) {
            if (emploee[i] != null && emploee[i].equals(department)) {
                condition = true;
                for (int j = 0; j < emploee.length; j++) {
                    if (emploee[j] != null && i != j && emploee[j].equals(department)) {
                        if (emploee[i].getSalary() > emploee[j].getSalary()) {
                        } else {
                            condition = false;

                        }
                    }
                }
                if (condition) {
                    System.out.println(" ФИО сотрудника с максимальной зарплатой: " + emploee[i].getSurname() + " " + emploee[i].getName() + " " + emploee[i].getPatronymic());
                    break;
                }
            }
        }
    }

    public void minSalary() {//вывод сотрудника с минимальной зарплатой 
        boolean condition;
        for (int i = 0; i < emploee.length; i++) {
            if (emploee[i] != null) {
                condition = true;
                for (int j = 0; j < emploee.length; j++) {
                    if (emploee[j] != null && i != j) {
                        if (emploee[i].getSalary() < emploee[j].getSalary()) {
                        } else {
                            condition = false;

                        }
                    }
                }
                if (condition) {
                    System.out.println(" ФИО сотрудника с минимальной зарплатой: " + emploee[i].getSurname() + " " + emploee[i].getName() + " " + emploee[i].getPatronymic());
                    break;
                }
            }
        }
    }

    public void minSalaryDepartment(String department) {//вывод сотрудника с минимальной зарплатой среди одного отдела 
        boolean condition;
        for (int i = 0; i < emploee.length; i++) {
            if (emploee[i] != null && emploee[i].equals(department)) {
                condition = true;
                for (int j = 0; j < emploee.length; j++) {
                    if (emploee[j] != null && i != j && emploee[j].equals(department)) {
                        if (emploee[i].getSalary()< emploee[j].getSalary()) {
                        } else {
                            condition = false;

                        }
                    }
                }
                if (condition) {
                    System.out.println(" ФИО сотрудника с минимальной зарплатой: " + emploee[i].getSurname() + " " + emploee[i].getName() + " " + emploee[i].getPatronymic());
                    break;
                }
            }
        }
    }

    public void fioEmployee() { // вывод ФИО все сотрудников
        for (int i = 0; i < emploee.length; i++) {
            if (emploee[i] != null) {
                System.out.println("Employee[" + i + "] - " + emploee[i].getSurname() + " " + emploee[i].getName() + " " + emploee[i].getPatronymic());
            }
        }
    }

    public void fioEmployeeDepartment(String department) { // вывод ФИО всех сотрудников одного отдела 
        System.out.println("Сотрудники отдела - " + department);
        for (int i = 0; i < emploee.length; i++) {
            if (emploee[i] != null && emploee[i].getDepartment().equals(department)) {
                System.out.println("Emploee - " + emploee[i].getSurname() + " " + emploee[i].getName() + " " + emploee[i].getPatronymic());
            }
        }
    }

    public void salaryIndexation(int interest) { // индексация зарплат всех сотрудников 
        for (int i = 0; i < emploee.length; i++) {
            if (emploee[i] != null) {
                double newSalary = 0;
                int newSalary1 = 0;
                newSalary = emploee[i].getSalary();
                newSalary = (newSalary / 100 * interest) + newSalary;
                newSalary1 = (int) newSalary;
                emploee[i].setSalary(newSalary1);
            }
        }
    }

    public void salaryIndexationDepartment(int interest, String department) { // индексация зарплат сотрудников одного отдела 
        if (interest > 0) {
            for (int i = 0; i < emploee.length; i++) {
                if (emploee[i] != null && emploee[i].getDepartment().equals(department)) {
                    double newSalary = 0;
                    int newSalary1 = 0;
                    newSalary = emploee[i].getSalary();
                    newSalary = (newSalary / 100 * interest) + newSalary;
                    newSalary1 = (int) newSalary;
                    emploee[i].setSalary(newSalary1);
                }
            }
        }
    }

    public void lessSalary(int lessSalary) { // вывод всех сотрудников с зарплатой меньше заданного числа 
        for (int i = 0; i < emploee.length; i++) {
            if (emploee[i] != null && lessSalary > emploee[i].getSalary()) {
                System.out.println("id:" + emploee[i].getId() + " ФИО: " + emploee[i].getSurname() + " " + emploee[i].getName() + " " + emploee[i].getPatronymic() + " Зарплата: " + emploee[i].getSalary());
            }
        }
    }

    public void moreSalary(int moreSalary) { // вывод всех сотрудников с зарплатой больше заданного числа 
        for (int i = 0; i < emploee.length; i++) {
            if (emploee[i] != null && moreSalary <= emploee[i].getSalary()) {
                System.out.println("id:" + emploee[i].getId() + " ФИО: " + emploee[i].getSurname() + " " + emploee[i].getName() + " " + emploee[i].getPatronymic() + " Зарплата: " + emploee[i].getSalary());
            }
        }
    }

    public void newEmployee(String surname, String name, String patronymic, String department, int salary) { // метод для добавления нового сотрудника в базу 
        for (int i = 0; i < emploee.length; i++) {
            if (emploee[i] == null) {
                emploee[i] = new Emploee(surname, name, patronymic, department, salary);
                break;
            }
        }
    }

    public void deleteEmployee(String surname, String name, String patronymic, int id) { // метод для удаления сотрудника из базы 
        for (int i = 0; i < emploee.length; i++) {
            if (emploee[i] != null && surname.equals(emploee[i].getSurname()) && name.equals(emploee[i].getName()) && patronymic.equals(emploee[i].getPatronymic()) && id == emploee[i].getId()) {
                emploee[i] = null;
                break;
            }
        }
    }

    public void changeSalary(String surname, String name, String patronymic, int salary) { // метод для изменения зарплаты у конкретного сотрудника 
        for (int i = 0; i < emploee.length; i++) {
            if (emploee[i] != null && surname.equals(emploee[i].getSurname()) && name.equals(emploee[i].getName()) && patronymic.equals(emploee[i].getPatronymic())) {
                emploee[i].setSalary(salary);
            }
        }
    }

    public void changeDepartment(String surname, String name, String patronymic, String department) { // метод для изменения отдела у конкретного сотрудника 
        for (int i = 0; i < emploee.length; i++) {
            if (emploee[i] != null && surname.equals(emploee[i].getSurname()) && name.equals(emploee[i].getName()) && patronymic.equals(emploee[i].getPatronymic())) {
                emploee[i].setDepartment(department);
            }
        }
    }

    public void departmentFullInformation() { // вывод списка сотрудников по отделам 
        String[] departments = new String[5];
        departments[0] = "1";
        departments[1] = "2";
        departments[2] = "3";
        departments[3] = "4";
        departments[4] = "5";
        for (int i = 0; i < departments.length; i++) {
            System.out.println("сотрудники отдела - " + departments[i]);
            for (int j = 0; j < emploee.length; j++) {
                if (emploee[j] != null && emploee[j].getDepartment().equals(departments[i])) {
                    System.out.println(" ФИО: " + emploee[j].getSurname() + " " + emploee[j].getName() + " " + emploee[j].getPatronymic());

                }
            }
        }

    }

    public EmployeeBook() { // храниение данных о сотрудниках 
        emploee[0] = new Emploee("Иванов", "Василий", "Гвазимодович", "1", 46000);

        emploee[1] = new Emploee("Петров", "Михаил", "Владимирович", "2", 47000);

        emploee[2] = new Emploee("Сидоров", "Евгений", "Олегович", "3", 48000);

        emploee[3] = new Emploee("Федоров", "Александр", "Аркадьевич", "4", 49000);

        emploee[4] = new Emploee("Шевцов", "Роман", "Семенович", "5", 50000);

        emploee[5] = new Emploee("Батоев", "Сергей", "Янович", "1", 51000);

        emploee[6] = new Emploee("Кондратенко", "Андрей", "Тимурович", "2", 52000);

        emploee[7] = new Emploee("Чайка", "Алексей", "Глебович", "3", 53000);

        emploee[8] = new Emploee("Тушков", "Юрий", "Ярославович", "4", 54000);

        emploee[9] = new Emploee("Кардонов", "Кирилл", "Леонидович", "5", 55000);
    }


}

