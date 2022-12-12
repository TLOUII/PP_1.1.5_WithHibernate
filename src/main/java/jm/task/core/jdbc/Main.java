package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        Util.getSessionFactory();
        UserService userDao = new UserServiceImpl();
        userDao.createUsersTable();

        userDao.saveUser("Name1", "LastName1", (byte) 22);
        userDao.saveUser("Name2", "LastName2", (byte) 22);
        userDao.saveUser("Name3", "LastName3", (byte) 22);
        userDao.saveUser("Name4", "LastName4", (byte) 22);

        userDao.removeUserById(1);
        userDao.getAllUsers();
        userDao.cleanUsersTable();
        userDao.dropUsersTable();
    }
}
