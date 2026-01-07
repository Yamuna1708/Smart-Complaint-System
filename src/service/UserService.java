package service;



import dao.UserDao;
import model.User;

public class UserService {

    UserDao dao = new UserDao();

    public User login(String username, String password) {
        return dao.login(username, password);
    }
}
