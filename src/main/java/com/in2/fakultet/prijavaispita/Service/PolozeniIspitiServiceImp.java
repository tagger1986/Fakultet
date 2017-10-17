
package com.in2.fakultet.prijavaispita.Service;

import com.in2.fakultet.prijavaispita.Entity.PolozeniIspiti;
import com.in2.fakultet.prijavaispita.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.in2.fakultet.prijavaispita.Repository.PolozeniIspitiRepository;
import com.in2.fakultet.prijavaispita.Repository.StudentRepository;
import java.util.ArrayList;
import java.util.List;


@Service
public class PolozeniIspitiServiceImp implements PolozeniIspitiService{
    
    private PolozeniIspitiRepository polozeniIspitiRepository;
    @Autowired
    private StudentRepository studentRepository;
    
    @Autowired
    public PolozeniIspitiServiceImp(PolozeniIspitiRepository polozeniIspitiRepository) {
           this.polozeniIspitiRepository = polozeniIspitiRepository;
    }

    @Override
    public List<PolozeniIspiti> findAllPolozeniIspiti() {
        List<PolozeniIspiti> ispiti = new ArrayList<>();
        polozeniIspitiRepository.findAll().forEach(ispiti::add);
        return ispiti;
    }
    
    @Override
    public PolozeniIspiti findById(int id) {
        return polozeniIspitiRepository.findOne(id);
    }

    @Override
    public PolozeniIspiti save(PolozeniIspiti ispit) {
        return polozeniIspitiRepository.save(ispit);
    }

    @Override
    public void delete(int id) {
        polozeniIspitiRepository.delete(id);
    }

    @Override
    public List<PolozeniIspiti> findAllByStudentId(int studentId) {
        Student student = studentRepository.findOne(studentId);
       return new ArrayList<>(student.getIspitivani());
    }

    @Override
    public String calculateAvg(int studentId) {
        Student student = studentRepository.findOne(studentId);
        List<PolozeniIspiti> studentIzv = student.getIspitivani();
        int brojacOcena = 0;
        double zbirOcena = 0;
        for (PolozeniIspiti polozeniIspiti : studentIzv) {
            zbirOcena += polozeniIspiti.getGrade();
            brojacOcena++;
        }
        double prosek = zbirOcena / brojacOcena;
        return "Prosecna ocena studenta "+ studentId + " je " + prosek;
    }
} 


