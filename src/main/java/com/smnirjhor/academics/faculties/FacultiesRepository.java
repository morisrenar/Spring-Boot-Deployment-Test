package com.smnirjhor.academics.faculties;

import com.smnirjhor.facilities.Facilities;
import com.smnirjhor.facilities.facilityservice.FacilityServices;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by bmshamsnahid on 7/26/17.
 */
public interface FacultiesRepository extends CrudRepository<Faculties, String> {
    public List<Faculties> findByAcademicsAcademicsId(String academicsId);
}
