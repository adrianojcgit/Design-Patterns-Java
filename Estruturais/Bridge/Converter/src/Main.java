import converters.CSVConverter;
import converters.Converter;
import converters.JsonConverter;
import employees.ITGuy;
import employees.ProjectManager;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Converter csvConverter = new CSVConverter();
        Converter jsonConverter = new JsonConverter();

        ITGuy it = new ITGuy("Maurice Moss", 32, 4000d);
        ProjectManager pm = new ProjectManager("Jen Barber", 40, 6000d);

        System.out.println(csvConverter.getEmployeeFormated(it));
        System.out.println(jsonConverter.getEmployeeFormated(it));
        System.out.println(csvConverter.getEmployeeFormated(pm));
        System.out.println(jsonConverter.getEmployeeFormated(pm));
    }
}