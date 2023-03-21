import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EmployeeDataReader {

    static Employee[] employees(String fileName) throws FileNotFoundException {
        final int linesNumber = countLines(fileName);
        Employee[] employees = new Employee[linesNumber];
        try (Scanner scanner = new Scanner(new File(fileName))) {
            for (int i = 0; i < linesNumber; i++) {
                String employeeLine = scanner.nextLine();
                employees[i] = createEmployeeFromCsv(employeeLine);
            }
        }
        return employees;

    }

    private static Employee createEmployeeFromCsv(String employeeLine) {
        String[] employeeData = employeeLine.split(";");
        String firstName = employeeData[0];
        String lastName = employeeData [1];
        String id = employeeData[2];
        String department = employeeData[3];
        double salary = Double.parseDouble(employeeData[4]);
        return new Employee(firstName, lastName, id, department, salary);

    }

    private static int countLines(String fileName) {
        int lines = 0;
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                scanner.nextLine();
                lines++;
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return lines;
    }
}