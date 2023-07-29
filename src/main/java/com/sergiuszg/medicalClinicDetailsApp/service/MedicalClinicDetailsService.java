package com.sergiuszg.medicalClinicDetailsApp.service;

import com.sergiuszg.medicalClinicDetailsApp.client.MedicalClinicClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MedicalClinicDetailsService {

    private final MedicalClinicClient medicalClinicClient;

    public List<Object> showAllDetails() {
        List<Object> objectList = new ArrayList<>();
        objectList.addAll(medicalClinicClient.showAllPatients());
        objectList.addAll(medicalClinicClient.showAllDoctors());
        objectList.addAll(medicalClinicClient.showAllFacilities());
        return objectList;
    }
}
