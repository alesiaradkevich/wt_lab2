package by.bsuir.wt.lab2.dao;

import by.bsuir.wt.lab2.dao.DAOImplementation;

public final class DAOFactory {
    private static final DAOFactory instance = new DAOFactory();

    private final DAO dao = new DAOImplementation();

    private DAOFactory() {
    }

    public DAO getApplianceDAO() {
        return dao;
    }

    public static DAOFactory getInstance() {
        return instance;
    }
}

