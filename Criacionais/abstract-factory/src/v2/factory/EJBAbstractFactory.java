package v2.factory;

import v2.services.CarEJBService;
import v2.services.CarService;
import v2.services.UserEJBService;
import v2.services.UserService;

public class EJBAbstractFactory implements ServicesAbstractFactory{
    @Override
    public UserService getUserService() {
        return new UserEJBService();
    }

    @Override
    public CarService getCarService() {
        return new CarEJBService();
    }
}
