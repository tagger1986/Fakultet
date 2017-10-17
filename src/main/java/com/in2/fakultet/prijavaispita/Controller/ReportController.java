package com.in2.fakultet.prijavaispita.Controller;

import com.in2.fakultet.prijavaispita.Entity.PolozeniIspiti;
import com.in2.fakultet.prijavaispita.Entity.Student;
import com.in2.fakultet.prijavaispita.Service.PolozeniIspitiService;
import com.in2.fakultet.prijavaispita.Service.StudentService;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author nosto
 */
@Controller
@RestController
@RequestMapping("/report")
public class ReportController {

    @Autowired
    private PolozeniIspitiService polozeniIspitiService;
    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/izv", method = RequestMethod.GET)
    public List<PolozeniIspiti> getAllPolozeniIspiti() {
        return polozeniIspitiService.getAllPolozeniIspiti();
    }

    @RequestMapping(value = "izv/{studentId}", method = RequestMethod.GET)
    public List<PolozeniIspiti> findAllByStudentId(@PathVariable int studentId) {
        Student student = studentService.findById(studentId);
        return new ArrayList<>(student.getIspitivani());
    }

    @RequestMapping(method = RequestMethod.POST)
    public void save(@RequestBody @Validated PolozeniIspiti ispit, BindingResult result) {
        if (result.hasErrors()) {
            System.out.println(result);
        } else {
            polozeniIspitiService.save(ispit);
        }
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") int id) {
        polozeniIspitiService.delete(id);
    }
}
