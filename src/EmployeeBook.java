public class EmployeeBook {
    private Emploee[] emploee = new Emploee[50];


    public void allEmployeesAndFullInformation() {
        for (int i = 0; i < emploee.length; i++) {
            if (emploee[i] != null) {
                System.out.println(emploee[i]);
            }
        }
    }

    public void departmentInformation(String department) {
        System.out.println("Сотрудники отдела - " + department);
        for (int i = 0; i < emploee.length; i++) {
            if (emploee[i] != null && emploee[i].getDepartment().equals(department)) {

                System.out.println("ФИО: - " + emploee[i].getSurname() + " " + emploee[i].getName() + " " + emploee[i].getPatronymic() + " Зарплата:" + emploee[i].getSalary());
            }
        }
    }

    public int salaryExpenses() {
        int sumSalary = 0;
        for (int i = 0; i < emploee.length; i++) {
            if (emploee[i] != null) {
                sumSalary = emploee[i].getSalary() + sumSalary;
            }
        }
        return sumSalary;
    }

    public int salaryExpensesForDepartment(String department) {
        int sumSalary = 0;
        for (int i = 0; i < emploee.length; i++) {
            if (emploee[i] != null && emploee[i].getDepartment().equals(department)) {
                sumSalary = emploee[i].getSalary() + sumSalary;
            }
        }
        return sumSalary;
    }

    public void averageSalary() {
        int average;
        average = salaryExpenses();
        average = average / emploee.length;
        System.out.println(average);
    }

    public void averageSalaryForDepartment(String department) {
        int average;
        int amountOfWorkers = 0;
        for (int i = 0; i < emploee.length; i++) {
            if (emploee[i] != null && emploee[i].getDepartment().equals(department)) amountOfWorkers++;
        }
        average = salaryExpenses();
        average = average / amountOfWorkers;
        System.out.println(average);
    }

    public void maxSalary() {
        int maxSalary = 0;
        for (int i = 0; i < emploee.length; i++) {
            if (emploee[i] != null && maxSalary < emploee[i].getSalary()) {
                maxSalary = emploee[i].getSalary();
            }
        }
    }

    public void maxSalaryDepartment(String department) {
        int maxSalary = 0;
        for (int i = 0; i < emploee.length; i++) {
            if (emploee[i] != null && emploee[i].getDepartment().equals(department)) {
                if (maxSalary < emploee[i].getSalary()) {
                    maxSalary = emploee[i].getSalary();
                }
            }
        }
    }

    public void minSalary() {
        int minSalary = 0;
        for (int i = 0; i < emploee.length; i++) {
            if (emploee[i] != null && minSalary > emploee[i].getSalary()) {
                minSalary = emploee[i].getSalary();
            }
        }
    }

    public void minSalaryDepartment(String department) {
        int minSalary = 0;
        for (int i = 0; i < emploee.length; i++) {
            if (emploee[i].getDepartment().equals(department)) {
                if (emploee[i] != null && minSalary > emploee[i].getSalary()) {
                    minSalary = emploee[i].getSalary();
                }
            }
        }
    }

    public void fioEmployee() {
        for (int i = 0; i < emploee.length; i++) {
            if (emploee[i] != null) {
                System.out.println("Employee[" + i + "] - " + emploee[i].getSurname() + " " + emploee[i].getName() + " " + emploee[i].getPatronymic());
            }
        }
    }

    public void fioEmployeeDepartment(String department) {
        System.out.println("Сотрудники отдела - " + department);
        for (int i = 0; i < emploee.length; i++) {
            if (emploee[i] != null && emploee[i].getDepartment().equals(department)) {
                System.out.println("Emploee - " + emploee[i].getSurname() + " " + emploee[i].getName() + " " + emploee[i].getPatronymic());
            }
        }
    }

    public void salaryIndexation(int interest) {
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

    public void salaryIndexationDepartment(int interest, String department) {
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

    public void lessSalary(int lessSalary) {
        for (int i = 0; i < emploee.length; i++) {
            if (emploee[i] != null && lessSalary > emploee[i].getSalary()) {
                System.out.println("id:" + emploee[i].getId() + " ФИО: " + emploee[i].getSurname() + " " + emploee[i].getName() + " " + emploee[i].getPatronymic() + " Зарплата: " + emploee[i].getSalary());
            }
        }
    }

    public void moreSalary(int moreSalary) {
        for (int i = 0; i < emploee.length; i++) {
            if (emploee[i] != null && moreSalary < emploee[i].getSalary()) {
                System.out.println("id:" + emploee[i].getId() + " ФИО: " + emploee[i].getSurname() + " " + emploee[i].getName() + " " + emploee[i].getPatronymic() + " Зарплата: " + emploee[i].getSalary());
            }
        }
    }

    public void newEmployee(String surname, String name, String patronymic, String department, int salary) {
        for (int i = 0; i < emploee.length; i++) {
            if (emploee[i] == null) {
                emploee[i] = new Emploee(surname, name, patronymic, department, salary);
                break;
            }
        }
    }

    public void deleteEmployee(String surname, String name, String patronymic, int id) {
        for (int i = 0; i < emploee.length; i++) {
            if (emploee[i] != null && surname.equals(emploee[i].getSurname()) && name.equals(emploee[i].getName()) && patronymic.equals(emploee[i].getPatronymic()) && id == emploee[i].getId()) {
                emploee[i] = null;
                break;
            }
        }
    }

    public void changeSalary(String surname, String name, String patronymic, int salary) {
        for (int i = 0; i < emploee.length; i++) {
            if (emploee[i] != null && surname.equals(emploee[i].getSurname()) && name.equals(emploee[i].getName()) && patronymic.equals(emploee[i].getPatronymic())) {
                emploee[i].setSalary(salary);
            }
        }
    }

    public void changeDepartment(String surname, String name, String patronymic, String department) {
        for (int i = 0; i < emploee.length; i++) {
            if (emploee[i] != null && surname.equals(emploee[i].getSurname()) && name.equals(emploee[i].getName()) && patronymic.equals(emploee[i].getPatronymic())) {
                emploee[i].setDepartment(department);
            }
        }
    }
    public void departmentFullInformation(){
        String[] departments = new String[5];
        departments[0] = "1";
        departments[1] = "2";
        departments[2] = "3";
        departments[3] = "4";
        departments[4] = "5";
        for (int i = 0; i < departments.length; i++) {
            System.out.println("сотрудники отдела - "+ departments[i]);
            for (int j = 0; j < emploee.length; j++) {
                if (emploee[j]!=null&&emploee[j].getDepartment().equals(departments[i])) {
                    System.out.println(" ФИО: " + emploee[j].getSurname() + " " + emploee[j].getName() + " " + emploee[j].getPatronymic() );

                }
            }
        }

    }



    public EmployeeBook() {
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

