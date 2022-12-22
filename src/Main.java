public class Main {
    public static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Иванов И.И", 1, 50000);
        employees[1] = new Employee("Семёнов С.С", 1, 65000);
        employees[2] = new Employee("Антонов А.А", 2, 30000);
        employees[3] = new Employee("Степанов С.С", 2, 45000);
        employees[4] = new Employee("Подольский С.В", 3, 24000);
        employees[5] = new Employee("Красов А.О", 3, 31000);
        employees[6] = new Employee("Поздин С.С", 4, 51100);
        employees[7] = new Employee("Белоозёров И.А", 4, 55500);
        employees[8] = new Employee("Иванов С.А", 5, 61800);
        employees[9] = new Employee("Мищенко Д.С", 5, 59200);
        printEmployees();
        printTotalSalary();
        printMinSalary();
        printMaxSalary();
        printAverageAmount();
        printNamesOfEmployees();

    }

    public static void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }

    public static void printTotalSalary() {
        System.out.println("Общая сумма затрат: " + getTotalSalary());
    }
    public static int getTotalSalary(){
        int total = 0;
        for (Employee employee : employees) {
            total += employee.getSalary();
        }
        return total;
    }

    public static void printMinSalary() {
        System.out.println("Сотрудник с минимальной зарплатой: " + getEmployeeMinSalary() );
    }

    public static Employee getEmployeeMinSalary(){
        int min = Integer.MAX_VALUE;
        for (Employee employee : employees) {
            if (employee.getSalary() < min) {
                min = employee.getSalary();
            }
        }
        Employee employeeMinSalary = null;
        for (Employee employee : employees) {
            if (employee.getSalary() == min) {
                employeeMinSalary = employee;
                break;
            }
        }
        return employeeMinSalary;
    }


    public static void printMaxSalary() {
        System.out.println("Максимальная зарплата сотрудника: " + getEmployeeMaxSalary());
    }

    public static Employee getEmployeeMaxSalary() {
        int max = Integer.MIN_VALUE;
        for (Employee employee : employees) {
            if (employee.getSalary() > max) {
                max = employee.getSalary();
            }
        }
        Employee employeeMaxSalary = null;
        for (Employee employee : employees) {
            if (employee.getSalary() == max) {
                employeeMaxSalary = employee;
                break;
            }
        }
        return employeeMaxSalary;
    }


    public static void printAverageAmount() {
        System.out.println("Средняя зарплата: " + getTotalSalary()/employees.length);
    }
    public static void printNamesOfEmployees(){
        System.out.println("ФИО сотрудников: ");
        for (Employee employee:employees) {
            System.out.println(employee.getFullName());
        }
    }
}
