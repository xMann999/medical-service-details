package com.sergiuszg.medicalClinicDetailsApp.service;

import com.sergiuszg.medicalClinicDetailsApp.client.MedicalClinicClient;
import com.sergiuszg.medicalClinicDetailsApp.model.MedicalClinicDetailsDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MedicalClinicDetailsService {

    private final MedicalClinicClient medicalClinicClient;

    public MedicalClinicDetailsDto showAllDetails() {
        return new MedicalClinicDetailsDto(medicalClinicClient.showAllPatients(), medicalClinicClient.showAllDoctors(), medicalClinicClient.showAllFacilities());
    }
}
