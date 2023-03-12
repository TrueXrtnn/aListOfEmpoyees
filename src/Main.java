import jdk.jfr.MemoryAddress;

public class Main {
    static Emploee[] emploee = new Emploee[10];

    public static void allEmployeesAndFullInformation(Emploee array[], String department) {
        if (department.equals("")) {
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        } else {
            System.out.println("Сотрудники отдела " + department);
            for (int i = 0; i < array.length; i++) {
                if (array[i].getDepartment().equals(department)) {
                    System.out.println("ФИО: - " + array[i].getSurname() + " " + array[i].getName() + " " + array[i].getPatronymic() + " Зарплата:" + array[i].getSalary());
                }
            }
        }
    }

    public static int salaryExpenses(Emploee array[], String department) {
        int sumSalary = 0;
        if (department.equals("")) {
            for (int i = 0; i < array.length; i++) {
                sumSalary = array[i].getSalary() + sumSalary;
            }
            return sumSalary;
        } else {
            for (int i = 0; i < array.length; i++) {
                if (array[i].getDepartment().equals(department)) {
                    sumSalary = array[i].getSalary() + sumSalary;
                }
            }

            return sumSalary;
        }
    }

    public static void averageSalary(Emploee array[], String department) {
        int avearage;
        if (department.equals("")) {
            avearage = salaryExpenses(array, "");
            avearage = avearage / array.length;
            System.out.println(avearage);
        } else {
            int amountOfWorkers = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i].getDepartment().equals(department)) {
                    amountOfWorkers++;
                }
            }
            avearage = salaryExpenses(array, department);
            avearage = avearage / amountOfWorkers;
            System.out.println(avearage);
        }
    }

    public static void maxSalary(Emploee array[], String department) {
        int maxSalary = 0;
        if (department.equals("")) {
            for (int i = 0; i < array.length; i++) {
                if (maxSalary < array[i].getSalary()) {
                    maxSalary = array[i].getSalary();
                }
            }
        } else
            for (int i = 0; i < array.length; i++) {
                if (array[i].getDepartment().equals(department)) {
                    if (maxSalary < array[i].getSalary()) {
                        maxSalary = array[i].getSalary();
                    }
                }
            }
    }

    public static void minSalary(Emploee array[], String department) {
        int minSalary = 0;
        if (department.equals("")) {
            for (int i = 0; i < array.length; i++) {
                if (minSalary < array[i].getSalary()) {
                    minSalary = array[i].getSalary();
                }
            }
        } else
            for (int i = 0; i < array.length; i++) {
                if (array[i].getDepartment().equals(department)) {
                    if (minSalary < array[i].getSalary()) {
                        minSalary = array[i].getSalary();
                    }
                }
            }
    }

    public static void fioEmploee(Emploee array[], String department) {
        if (department.equals("")) {
            for (int i = 0; i < array.length; i++) {
                System.out.println("Emploee[" + i + "] - " + array[i].getSurname() + " " + array[i].getName() + " " + array[i].getPatronymic());
            }
        } else {
            System.out.println("Сотрудники отдела " + department);
            for (int i = 0; i < array.length; i++) {
                if (array[i].getDepartment().equals(department)) {
                    System.out.println("Emploee - " + array[i].getSurname() + " " + array[i].getName() + " " + array[i].getPatronymic());
                }
            }
        }
    }

    public static void salaryIndexation(Emploee array[], int interest, String department) {
        if (department.equals("")) {
            if (interest > 0) {
                for (int i = 0; i < array.length; i++) {
                    double newSalary = 0;
                    int newSalary1 = 0;
                    newSalary = array[i].getSalary();
                    newSalary = (newSalary / 100 * interest) + newSalary;
                    newSalary1 = (int) newSalary;
                    array[i].setSalary(newSalary1);
                }
            }
        } else {
            for (int i = 0; i < array.length; i++) {
                if (array[i].getDepartment().equals(department)) {
                    double newSalary = 0;
                    int newSalary1 = 0;
                    newSalary = array[i].getSalary();
                    newSalary = (newSalary / 100 * interest) + newSalary;
                    newSalary1 = (int) newSalary;
                    array[i].setSalary(newSalary1);
                }
            }

        }
    }

    public static void main(String[] args) {
        Emploee sotrudnik1 = new Emploee("Иванов", "Иван", "Иванович", "1", 30000);
        System.out.println(sotrudnik1.getName());
        emploee[0] = new Emploee("Петров", "Валерий", "Владимирович", "1", 46000);
        emploee[1] = new Emploee("Петров", "Валерий", "Владимирович", "2", 47000);
        emploee[2] = new Emploee("Петров", "Валерий", "Владимирович", "3", 48000);
        emploee[3] = new Emploee("Петров", "Валерий", "Владимирович", "4", 49000);
        emploee[4] = new Emploee("Петров", "Валерий", "Владимирович", "5", 50000);
        emploee[5] = new Emploee("Петров", "Валерий", "Владимирович", "1", 51000);
        emploee[6] = new Emploee("Петров", "Валерий", "Владимирович", "2", 52000);
        emploee[7] = new Emploee("Петров", "Валерий", "Владимирович", "3", 53000);
        emploee[8] = new Emploee("Петров", "Валерий", "Владимирович", "4", 54000);
        emploee[9] = new Emploee("Петров", "Валерий", "Владимирович", "5", 55000);
        System.out.println(sotrudnik1);
        averageSalary(emploee,"");
        System.out.println(salaryExpenses(emploee,""));
        fioEmploee(emploee,"");
        salaryIndexation(emploee, 10,"");
        allEmployeesAndFullInformation(emploee, "1");


    }
}