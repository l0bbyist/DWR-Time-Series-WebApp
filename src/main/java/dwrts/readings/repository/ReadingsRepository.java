package dwrts.readings.repository;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
import dwrts.readings.model.Readings;

//@Repository
public interface ReadingsRepository extends JpaRepository<Readings, Integer> {
    // Additional custom queries can be added here if needed
}
