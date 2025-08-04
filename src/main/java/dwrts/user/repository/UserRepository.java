package dwrts.user.repository;

//import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import dwrts.user.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
   //Optional<Staff> findByEmail(String email); // Fetch staff by email
    
    //Staff findByEmail(String email);

}
