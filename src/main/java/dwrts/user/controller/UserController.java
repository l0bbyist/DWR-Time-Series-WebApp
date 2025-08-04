package dwrts.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import dwrts.user.service.UserService;
import dwrts.user.model.User;

import java.util.List;

@RestController
@RequestMapping("/users")

public class UserController {

    @Autowired
    private UserService userService;

    // Get list of staff
    @GetMapping
    @ResponseBody
    public List<User> getAllUsersAsJson() {
        return userService.getAllUsers();
   }
    
    // Get a staff by ID
    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Integer id) {
        return userService.getUserById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Add a new staff
    @PostMapping
    public User createStaff(@RequestBody User user) {
        return userService.createUser(user);
    }

    // Update a staff
    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@PathVariable Integer id, @RequestBody User updatedUser) {
        return userService.updateUser(id, updatedUser)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Delete a staff
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStaff(@PathVariable Integer id) {
        return userService.deleteUser(id) ? 
            ResponseEntity.noContent().build() : 
            ResponseEntity.notFound().build();
    }
}

