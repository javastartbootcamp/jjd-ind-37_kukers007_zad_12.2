import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File("employees.csv");
        Employee[] employees = EmployeeDataReader.employees("employees.csv");

        if (file.exists()) {
            File stats = new File("stats.txt");
            stats.createNewFile();
            FileWriter fileWriter = new FileWriter(stats);
            fileWriter.write("Średnia wypłata: " + EmployeeStats.avgPayment(employees));
            fileWriter.write("\n");
            fileWriter.write("Minimalna wypłata: " + EmployeeStats.minPayment(employees));
            fileWriter.write("\n");
            fileWriter.write("Maksymalna wypłata: " + EmployeeStats.maxPayment(employees));
            fileWriter.write("\n");
            fileWriter.write("Liczba pracowników IT: " + EmployeeStats.departmentEmployee(employees, "IT"));
            fileWriter.write("\n");
            fileWriter.write("Liczba pracowników Support: " + EmployeeStats.departmentEmployee(employees, "Support"));
            fileWriter.write("\n");
            fileWriter.write("Liczba pracowników Management: " + EmployeeStats.departmentEmployee(employees, "Management"));
            fileWriter.close();
        }
    }
}
