package com.hospital.Hospital.service;

import com.hospital.Hospital.entity.Doctor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DoctorService {
    Doctor addDoctor(Doctor doctor);
    List<Doctor> getDoctor();
    String updateDoctor(Doctor doctor, int id);
    void deleteDoctor(int id);
}
