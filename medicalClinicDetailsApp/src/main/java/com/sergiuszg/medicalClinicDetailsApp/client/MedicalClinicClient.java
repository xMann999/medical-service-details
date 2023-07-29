package com.sergiuszg.medicalClinicDetailsApp.client;

import com.sergiuszg.medicalClinicDetailsApp.model.DoctorDto;
import com.sergiuszg.medicalClinicDetailsApp.model.FacilityDto;
import com.sergiuszg.medicalClinicDetailsApp.model.PatientDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "medical-service", url = "localhost:8080")
public interface MedicalClinicClient {

    @RequestMapping(method = RequestMethod.GET, value = "/facilities")
    List<FacilityDto> showAllFacilities();

    @RequestMapping(method = RequestMethod.GET, value = "/patients")
    List<PatientDto> showAllPatients();

    @RequestMapping(method = RequestMethod.GET, value = "/doctors")
    List<DoctorDto> showAllDoctors();
}

