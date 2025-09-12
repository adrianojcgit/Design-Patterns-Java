package v2.factory;

import v2.services.CarRestService;
import v2.services.CarService;
import v2.services.UserRestService;
import v2.services.UserService;

public class RestAbstractFactory implements ServicesAbstractFactory{
    @Override
    public UserService getUserService() {
        return new UserRestService();
    }

    @Override
    public CarService getCarService() {
        return new CarRestService();
    }
}
