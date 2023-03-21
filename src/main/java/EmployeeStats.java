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

    static int itEmployee(Employee[] employees) {
        int count = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment().equals("IT")) {
                count++;
            }
        }
        return count;
    }

    static int supportEmployee(Employee[] employees) {
        int count = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment().equals("Support")) {
                count++;
            }
        }
        return count;
    }

    static int managementEmployee(Employee[] employees) {
        int count = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment().equals("Management")) {
                count++;
            }
        }
        return count;
    }
}
