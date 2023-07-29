package com.sergiuszg.medicalClinicDetailsApp.model;

import lombok.Data;

@Data
public class FacilityDto {

    private final String type = "Facility";
    private final Long id;
    private final String name;
    private final String city;
    private final String postalCode;
    private final String street;
    private final String streetNo;
}
