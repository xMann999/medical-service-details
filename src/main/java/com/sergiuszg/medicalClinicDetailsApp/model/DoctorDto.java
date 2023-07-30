package com.sergiuszg.medicalClinicDetailsApp.model;

import lombok.Data;

@Data
public class DoctorDto {

    private final Long id;
    private final String email;
    private final String firstName;
    private final String lastName;
    private final Specialisation specialisation;
    private final Long facilityId;
}
