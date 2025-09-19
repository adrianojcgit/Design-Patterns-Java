import commands.ProductTable;
import commands.UserTable;
import commands.UserTableRoleColumn;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Map<String, List<String>> database = new LinkedHashMap<String, List<String>>();
        MigrationTool tool = new MigrationTool();
        tool.addMigration(new UserTable(database));
        tool.addMigration(new ProductTable(database));
        tool.addMigration(new UserTableRoleColumn(database));

        System.out.println(database);

        tool.up();
        System.out.println(database);

        tool.up();
        System.out.println(database);

        tool.up();
        System.out.println(database);

        tool.up();
        System.out.println(database);

        tool.down();
        System.out.println(database);

        tool.down();
        System.out.println(database);

        tool.down();
        System.out.println(database);

        tool.down();
        System.out.println(database);

        tool.latest();
        System.out.println(database);

        tool.roolback();
        System.out.println(database);
    }
}