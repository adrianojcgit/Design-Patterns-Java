import dao.UserMongoDao;
import dao.UserMysqlDao;
import dao.UserOracleDao;
import dao.UserPostgresDao;
import model.User;
import services.UserEJB;
import services.UserRest;
import services.UserService;
import services.UserSoap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        User user = new User("user", "user@email.com", "passwd");

        UserService userRestOracleService = new UserRest(new UserOracleDao());
        userRestOracleService.save(user);

        UserService userEJBMongoService = new UserEJB(new UserMongoDao());
        userEJBMongoService.save(user);

        UserService userSoapPostgresService = new UserSoap(new UserPostgresDao());
        userSoapPostgresService.save(user);

        UserService userRestMysqlService = new UserRest(new UserMysqlDao());
        userRestMysqlService.save(user);
    }
}