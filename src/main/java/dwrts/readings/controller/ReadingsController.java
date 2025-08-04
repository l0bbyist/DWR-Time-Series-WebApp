package dwrts.readings.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import dwrts.readings.model.Readings;
import dwrts.readings.service.ReadingsService;

import java.util.List;

@RestController
@RequestMapping("/usomaji")

public class ReadingsController {

    @Autowired
    private ReadingsService readingsService;

    // Get list of devices
    @GetMapping
    @ResponseBody
    public List<Readings> getAllReadingssAsJson() {
        return readingsService.getAllReadingss();
   }
    
    // Get a device by ID
    @GetMapping("/{id}")
    public ResponseEntity<Readings> getReadingsById(@PathVariable Integer id) {
        return readingsService.getReadingsById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Add a new device
    @PostMapping
    public Readings createReadings(@RequestBody Readings readings) {
        return readingsService.createReadings(readings);
    }

    // Update a device
   // @PutMapping("/{id}")
   // public ResponseEntity<Readings> updateReadings(@PathVariable Integer id, @RequestBody Readings updatedReadings) {
    //    return readingsService.updateReadings(id, updatedReadings)
    //            .map(ResponseEntity::ok)
     //           .orElse(ResponseEntity.notFound().build());
   // }

    // Delete a device
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteReadings(@PathVariable Integer id) {
        return readingsService.deleteReadings(id) ? 
            ResponseEntity.noContent().build() : 
            ResponseEntity.notFound().build();
    }
}

