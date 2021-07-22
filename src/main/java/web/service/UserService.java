package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.model.User;
import web.repository.UserRepository;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getListAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(int id) {
        return userRepository.findOne(id);
    }

    public void saveUser(User user) {
        userRepository.save(user);
    }

    public void updateUser(User user, int id) {
        userRepository.save(user);
    }

    public void deleteUser(int id) {
        userRepository.delete(getUserById(id));
    }

}
