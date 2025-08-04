package dwrts.readings.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dwrts.readings.model.Readings;
import dwrts.readings.repository.ReadingsRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ReadingsService {

    @Autowired
    private ReadingsRepository readingsRepository;

    // Get all devices
    public List<Readings> getAllReadingss() {
        return readingsRepository.findAll();
    }

    // Get device by ID
    public Optional<Readings> getReadingsById(Integer id) {
        return readingsRepository.findById(id);
    }

    // Create a new device
    public Readings createReadings(Readings readings) {
        return readingsRepository.save(readings);
    }

    // Update an existing device
    //public Optional<Readings> updateReadings(Integer id, Readings updatedReadings) {
       // return readingsRepository.findById(id).map(readings -> {
        //	readings.setDev_NAME(updatedReadings.getDev_NAME());
        //	readings.setBRAND(updatedReadings.getBRAND());
        //	readings.setSERIAL(updatedReadings.getSERIAL());
        //	readings.setDev_OS(updatedReadings.getDev_OS());
        //	readings.setSTATUS(updatedReadings.getSTATUS());
        //	readings.setDate_Added(updatedReadings.getDate_Added());
         //   return readingsRepository.save(readings);
      //  });
   // }

    // Delete device by ID
    public boolean deleteReadings(Integer dev_ID) {
        return readingsRepository.findById(dev_ID).map(readings -> {
        	readingsRepository.delete(readings);
            return true;
        }).orElse(false);
    }
}

