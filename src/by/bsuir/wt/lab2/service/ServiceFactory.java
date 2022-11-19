package by.bsuir.wt.lab2.service;

import by.bsuir.wt.lab2.service.Service;

public final class ServiceFactory {
    private static final ServiceFactory instance = new ServiceFactory();

    private final IService applianceService = new Service();

    private ServiceFactory() {}

    public IService getApplianceService() {

        return applianceService;
    }

    public static ServiceFactory getInstance() {
        return instance;
    }

}
