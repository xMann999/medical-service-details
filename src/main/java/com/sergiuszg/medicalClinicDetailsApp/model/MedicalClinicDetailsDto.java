package com.sergiuszg.medicalClinicDetailsApp.model;

import lombok.Data;

import java.util.List;

@Data
public class MedicalClinicDetailsDto {

    private final List<PatientDto> patients;
    private final List<DoctorDto> doctors;
    private final List<FacilityDto> facilities;
}
