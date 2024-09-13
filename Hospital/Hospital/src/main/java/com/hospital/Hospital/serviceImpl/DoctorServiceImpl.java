package com.hospital.Hospital.serviceImpl;

import com.hospital.Hospital.entity.Doctor;
import com.hospital.Hospital.repository.DoctorRepository;
import com.hospital.Hospital.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    @Override
    public Doctor addDoctor(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    @Override
    public List<Doctor> getDoctor() {
        return doctorRepository.findAll();
    }

    @Override
    public String updateDoctor(Doctor doctor, int id) {
        Optional<Doctor> doctor1 = doctorRepository.findById(id);
        if(doctor1.isPresent()){
            Doctor doctor2 = doctor1.get();
            doctor2.setId(doctor.getId());
            doctor2.setFullName(doctor.getFullName());
            doctor2.setDob(doctor.getDob());
            doctor2.setQualification(doctor.getQualification());
            doctor2.setSpecialist(doctor.getSpecialist());
            doctor2.setEmail(doctor.getEmail());
            doctor2.setMobNo(doctor.getMobNo());
            doctor2.setPassword(doctor.getPassword());
            doctorRepository.save(doctor2);
            return "Updated the Doctor details" +doctor2;
        }
        else{
            return "No doctor with these details " + doctor + "was found";
        }
    }

    @Override
    public void deleteDoctor(int id) {
        doctorRepository.deleteById(id);
    }
}
