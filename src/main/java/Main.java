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
            fileWriter.write("Average Payment: " + EmployeeStats.avgPayment(employees));
            fileWriter.write("\n");
            fileWriter.write("The lowest Payment: " + EmployeeStats.avgPayment(employees));
            fileWriter.write("\n");
            fileWriter.write("The highest Payment: " + EmployeeStats.avgPayment(employees));
            fileWriter.write("\n");
            fileWriter.write("Employees IT: " + EmployeeStats.avgPayment(employees));
            fileWriter.write("\n");
            fileWriter.write("Employees Support: " + EmployeeStats.avgPayment(employees));
            fileWriter.write("\n");
            fileWriter.write("Employees Management: " + EmployeeStats.avgPayment(employees));
            fileWriter.close();
        }
    }
}
