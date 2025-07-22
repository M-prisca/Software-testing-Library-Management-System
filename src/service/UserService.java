package service;

import model.User;
import util.PasswordUtil;

import java.util.HashMap;

public class UserService {
    private HashMap<String, User> users = new HashMap<>();

    // Create account
    public void createAccount(User user, String plainPassword) {
        String hashedPassword = PasswordUtil.hashPassword(plainPassword);
        user.setHashedPassword(hashedPassword);
        users.put(user.getUsername(), user);
    }

    // Authenticate
    public boolean authenticate(String username, String password) {
        User user = users.get(username);
        if (user == null)
            return false;

        String hashedPassword = PasswordUtil.hashPassword(password);
        return hashedPassword.equals(user.getHashedPassword());
    }

    public User getUserByUsername(String username) {
        return users.get(username);
    }
}
