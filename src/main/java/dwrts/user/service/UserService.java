package dwrts.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dwrts.user.model.User;
import dwrts.user.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Get all staffs
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Get staff by ID
    public Optional<User> getUserById(Integer id) {
        return userRepository.findById(id);
    }

    // Create a new staff
    public User createUser(User user) {
        return userRepository.save(user);
    }

    // Update an existing staff
    public Optional<User> updateUser(Integer id, User updatedUser) {
        return userRepository.findById(id).map(user -> {
            user.setcheque_no(updatedUser.getcheque_no());
            user.setemail(updatedUser.getemail());
            user.setname(updatedUser.getname());
            user.setphone(updatedUser.getphone());
            return userRepository.save(user);
        });
    }

    // Delete staff by ID
    public boolean deleteUser(Integer id) {
        return userRepository.findById(id).map(user -> {
            userRepository.delete(user);
            return true;
        }).orElse(false);
    }
}

