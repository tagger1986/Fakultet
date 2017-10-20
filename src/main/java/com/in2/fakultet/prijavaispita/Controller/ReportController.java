package com.in2.fakultet.prijavaispita.Controller;

import com.in2.fakultet.prijavaispita.Entity.PolozeniIspiti;
import com.in2.fakultet.prijavaispita.Service.PolozeniIspitiService;
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

@Controller
@RestController
@RequestMapping("/report")
public class ReportController {

    @Autowired
    private PolozeniIspitiService polozeniIspitiService;

    @RequestMapping(value = "/izv", method = RequestMethod.GET)
    public List<PolozeniIspiti> findAllPolozeniIspiti() {
        return polozeniIspitiService.findAllPolozeniIspiti();
    }

    @RequestMapping(value = "izv/{studentId}", method = RequestMethod.GET)
    public List<PolozeniIspiti> findAllByStudentId(@PathVariable int studentId) {
        return polozeniIspitiService.findAllByStudentId(studentId);
    }

    @RequestMapping(value = "average/{studentId}", method = RequestMethod.GET)
    public String calculateAvg(@PathVariable int studentId) {
        return polozeniIspitiService.calculateAvg(studentId);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void save(@RequestBody @Valid PolozeniIspiti ispit, BindingResult result) {
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
