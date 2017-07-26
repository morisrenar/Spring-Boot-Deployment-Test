package com.smnirjhor.facilities.directors;

import com.smnirjhor.facilities.facilityservice.FacilityServices;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by bmshamsnahid on 7/26/17.
 */
public interface DirectorsRepository extends CrudRepository<Directors, String> {
    public List<Directors> findByFacilitiesFacilitiesId(String facilitiesId);
}
