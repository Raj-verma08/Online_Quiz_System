package service;

import dao.UserDAO;
import model.User;

public class AuthService {
    private UserDAO userDAO = new UserDAO();

    public User login(String username, String password) {
        return userDAO.login(username, password);
    }

    public boolean register(String username, String password, String role) {
        User user = new User(username, password, role);
        return userDAO.registerUser(user);
    }
}

