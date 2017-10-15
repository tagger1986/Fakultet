
package com.in2.fakultet.prijavaispita.Service;

import com.in2.fakultet.prijavaispita.Entity.PolozeniIspiti;
import com.in2.fakultet.prijavaispita.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.in2.fakultet.prijavaispita.Repository.PolozeniIspitiRepository;
import com.in2.fakultet.prijavaispita.Repository.StudentRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.data.domain.Sort;


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
    public List<PolozeniIspiti> getAllPolozeniIspiti() {
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
    public List<PolozeniIspiti> getAllByStudent(int id) {
        List<PolozeniIspiti> ispiti = new ArrayList<>();
        ispiti= studentRepository.findOne(id).getIspitivani();
        return ispiti;
       }

//     public Set<PolozeniIspiti> findAll() {
//        return polozeniIspitiRepository.findAll());
//    }

//    private Sort sortByNameDesc() {
//        return new Sort(Sort.Direction.DESC, "name");
//    }
//    private Sort sortByGradeAsc() {
//        return new Sort(Sort.Direction.ASC, "grade");
//    }

    @Override
    public List<PolozeniIspiti> findAllByStudentId(int studentId) {
      return polozeniIspitiRepository.findAllByStudentId(studentId);
    }
    
    


  
} 


