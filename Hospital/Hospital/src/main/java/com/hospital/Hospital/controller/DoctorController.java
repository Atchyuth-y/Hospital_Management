package com.hospital.Hospital.controller;

import com.hospital.Hospital.entity.Doctor;
import com.hospital.Hospital.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @PostMapping("/addDoctor")
    public Doctor addDoctor(@RequestBody Doctor doctor){
        return doctorService.addDoctor(doctor);
    }

    @GetMapping("/findDoctor")
    public List<Doctor> getDoctor(){
        return doctorService.getDoctor();
    }

    @PutMapping("/updateDoctor/{id}")
    public String updateDoctor(@RequestBody Doctor doctor, @PathVariable int id){
        return doctorService.updateDoctor(doctor, id);
    }

    @DeleteMapping("/deleteDoctor/{id}")
    public void deleteDoctor(@PathVariable int id){
        doctorService.deleteDoctor(id);
    }

}
