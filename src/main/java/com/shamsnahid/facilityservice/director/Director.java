package com.shamsnahid.facilityservice.director;

import com.shamsnahid.facilityservice.FacilityServices;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by bmshamsnahid on 7/24/17.
 */
@Entity
public class Director {
    @Id
    private String facilityServiceDirectorId;
    private String facilityServiceDirectorName;
    private String facilityServiceDirectorContactaNumber;
    private String facilityServiceDirectorEmailAddress;
    private String facilityServiceDirectorRoomNumber;
    private String facilityServiceDirectorInformation;
    @ManyToOne
    private FacilityServices facilityServices;

    public Director() {
    }

    public Director(String facilityServiceDirectorId, String facilityServiceDirectorName, String facilityServiceDirectorContactaNumber, String facilityServiceDirectorEmailAddress, String facilityServiceDirectorRoomNumber, String facilityServiceDirectorInformation, FacilityServices facilityServices) {
        this.facilityServiceDirectorId = facilityServiceDirectorId;
        this.facilityServiceDirectorName = facilityServiceDirectorName;
        this.facilityServiceDirectorContactaNumber = facilityServiceDirectorContactaNumber;
        this.facilityServiceDirectorEmailAddress = facilityServiceDirectorEmailAddress;
        this.facilityServiceDirectorRoomNumber = facilityServiceDirectorRoomNumber;
        this.facilityServiceDirectorInformation = facilityServiceDirectorInformation;
        this.facilityServices = facilityServices;
    }

    public String getFacilityServiceDirectorId() {
        return facilityServiceDirectorId;
    }

    public void setFacilityServiceDirectorId(String facilityServiceDirectorId) {
        this.facilityServiceDirectorId = facilityServiceDirectorId;
    }

    public String getFacilityServiceDirectorName() {
        return facilityServiceDirectorName;
    }

    public void setFacilityServiceDirectorName(String facilityServiceDirectorName) {
        this.facilityServiceDirectorName = facilityServiceDirectorName;
    }

    public String getFacilityServiceDirectorContactaNumber() {
        return facilityServiceDirectorContactaNumber;
    }

    public void setFacilityServiceDirectorContactaNumber(String facilityServiceDirectorContactaNumber) {
        this.facilityServiceDirectorContactaNumber = facilityServiceDirectorContactaNumber;
    }

    public String getFacilityServiceDirectorEmailAddress() {
        return facilityServiceDirectorEmailAddress;
    }

    public void setFacilityServiceDirectorEmailAddress(String facilityServiceDirectorEmailAddress) {
        this.facilityServiceDirectorEmailAddress = facilityServiceDirectorEmailAddress;
    }

    public String getFacilityServiceDirectorRoomNumber() {
        return facilityServiceDirectorRoomNumber;
    }

    public void setFacilityServiceDirectorRoomNumber(String facilityServiceDirectorRoomNumber) {
        this.facilityServiceDirectorRoomNumber = facilityServiceDirectorRoomNumber;
    }

    public String getFacilityServiceDirectorInformation() {
        return facilityServiceDirectorInformation;
    }

    public void setFacilityServiceDirectorInformation(String facilityServiceDirectorInformation) {
        this.facilityServiceDirectorInformation = facilityServiceDirectorInformation;
    }

    public FacilityServices getFacilityServices() {
        return facilityServices;
    }

    public void setFacilityServices(FacilityServices facilityServices) {
        this.facilityServices = facilityServices;
    }
}
