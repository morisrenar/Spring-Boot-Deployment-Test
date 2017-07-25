package com.shamsnahid.facilityservice.director;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bmshamsnahid on 7/24/17.
 */
@Service
public class DirectorService {
    @Autowired
    DirectorRepository directorRepository;

    public void createDirector(Director director) {
        directorRepository.save(director);
    }

    public List<Director> getAllDirectors(String facilitiesId, String facilityServicesId) {
        List<Director> directors = new ArrayList<>();
        directorRepository.findAll();
        for(Director drc : directorRepository.findAll()) {
            if(drc.getFacilityServices().getFacilityServicesId().equals(facilityServicesId)) {
                directors.add(drc);
            }
        }
        return directors;
    }

    public void updateDirector(Director director) {
        directorRepository.save(director);
    }

    public Director getDirector(String facilitiesId, String facilityServicesId, String facilityServiceDirectorId) {
        return directorRepository.findOne(facilityServiceDirectorId);
    }

    public void deleteDirector(String facilitiesId, String facilityServicesId, String facilityServiceDirectorId) {
        directorRepository.delete(facilityServiceDirectorId);
    }
}
