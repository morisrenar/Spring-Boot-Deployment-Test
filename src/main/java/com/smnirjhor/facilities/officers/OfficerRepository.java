package com.smnirjhor.facilities.officers;

import com.smnirjhor.facilities.directors.Directors;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by bmshamsnahid on 7/26/17.
 */
public interface OfficerRepository extends CrudRepository<Officer, String> {
    public List<Officer> findByFacilitiesFacilitiesId(String facilitiesId);
}
