package v2;

import v2.factory.EJBAbstractFactory;
import v2.factory.RestAbstractFactory;
import v2.factory.ServicesAbstractFactory;
import v2.services.CarService;
import v2.services.UserService;

public class Main {
    public static void main(String[] args) {
//        ServicesAbstractFactory factory = new EJBAbstractFactory();
		ServicesAbstractFactory factory = new RestAbstractFactory();

        UserService userService = factory.getUserService();
        userService.save("Jhon");
        userService.delete(5);

        CarService carService = factory.getCarService();
        carService.save("Prius");
        carService.update("Tesla X");
    }
}
