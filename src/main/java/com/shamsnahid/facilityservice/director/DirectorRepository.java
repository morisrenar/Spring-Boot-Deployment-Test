package com.shamsnahid.facilityservice.director;

import com.shamsnahid.facilityservice.FacilityServices;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by bmshamsnahid on 7/24/17.
 */
public interface DirectorRepository extends CrudRepository<Director, String> {
    public List<Director> findByFacilityServicesFacilityServicesId(String facilitiesServiceId, String facilitiesId);
}
