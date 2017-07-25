package com.shamsnahid.facilityservice.director;

import com.shamsnahid.facilities.Facilities;
import com.shamsnahid.facilityservice.FacilityServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by bmshamsnahid on 7/24/17.
 */
@RestController
@RequestMapping("/ru/facility")
public class DirectorController {

    @Autowired
    DirectorService directorService;

    @RequestMapping(method = RequestMethod.GET, value = "/director")
    public String sayHello() {
        return "Hello from director";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{facilitiesId}/facilityService/{facilityServicesId}/directors")
    public void createDirector(@RequestBody Director director, @PathVariable String facilitiesId, @PathVariable String facilityServicesId) {
        FacilityServices facilityServices = new FacilityServices();
        facilityServices.setFacilities(new Facilities(facilitiesId, "", ""));
        facilityServices.setFacilityServicesId(facilityServicesId);
        director.setFacilityServices(facilityServices);
        directorService.createDirector(director);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{facilitiesId}/facilityService/{facilityServicesId}/directors")
    public List<Director> getAllDirectors(@PathVariable String facilitiesId, @PathVariable String facilityServicesId) {
        return directorService.getAllDirectors(facilitiesId, facilityServicesId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{facilitiesId}/facilityService/{facilityServicesId}/directors/{facilityServiceDirectorId}")
    public Director getDirector(@PathVariable String facilitiesId, @PathVariable String facilityServicesId, @PathVariable String facilityServiceDirectorId) {
        return directorService.getDirector(facilitiesId, facilityServicesId, facilityServiceDirectorId);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{facilitiesId}/facilityService/{facilityServicesId}/directors/{facilityServiceDirectorId}")
    public void updateDirector(@RequestBody Director director, @PathVariable String facilitiesId, @PathVariable String facilityServicesId, @PathVariable String facilityServiceDirectorId) {
        FacilityServices facilityServices = new FacilityServices();
        facilityServices.setFacilities(new Facilities(facilitiesId, "", ""));
        facilityServices.setFacilityServicesId(facilityServicesId);
        director.setFacilityServices(facilityServices);
        directorService.updateDirector(director);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{facilitiesId}/facilityService/{facilityServicesId}/directors/{facilityServiceDirectorId}")
    public void deleteDirector(@PathVariable String facilitiesId, @PathVariable String facilityServicesId, @PathVariable String facilityServiceDirectorId) {
        directorService.deleteDirector(facilitiesId, facilityServicesId, facilityServiceDirectorId);
    }


}
