public class EmployeeStats {

    static double avgPayment(Employee[] employees) {
        double salary = 0;
        for (Employee employee : employees) {
            salary += employee.getPayment();
        }
        return salary / employees.length;
    }

    static double minPayment(Employee[] employees) {
        double minPay = employees[0].getPayment();
        for (Employee employee : employees) {
            if (minPay > employee.getPayment()) {
                minPay = employee.getPayment();
            }
        }
        return minPay;
    }

    static double maxPayment(Employee[] employees) {
        double maxPay = employees[0].getPayment();
        for (Employee employee : employees) {
            if (maxPay < employee.getPayment()) {
                maxPay = employee.getPayment();
            }
        }
        return maxPay;

    }

    static int departmentEmployee(Employee[] employees, String department) {
        int count = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment().equals(department)) {
                count++;
            }
        }
        return count;
    }
}