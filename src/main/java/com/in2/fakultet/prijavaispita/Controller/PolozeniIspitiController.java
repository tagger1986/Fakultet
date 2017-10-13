
package com.in2.fakultet.prijavaispita.Controller;

import com.in2.fakultet.prijavaispita.Entity.PolozeniIspiti;
import com.in2.fakultet.prijavaispita.Service.PolozeniIspitiService;
import com.in2.fakultet.prijavaispita.Service.PredmetService;
import com.in2.fakultet.prijavaispita.Service.StudentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
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
public class PolozeniIspitiController{
    @Autowired
    private PolozeniIspitiService polozeniIspitiService;
    @Autowired
    private PredmetService predmetService;
    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/izv",method = RequestMethod.GET) 
    public List<PolozeniIspiti>getAllPolozeniIspiti() {
        return polozeniIspitiService.getAllPolozeniIspiti();
    }
        

    @RequestMapping (value = "izv/{sid}", method = RequestMethod.GET)
    public List<PolozeniIspiti> findAllBySid(@ModelAttribute("studentId") PolozeniIspiti polozeniIspiti ){      /// NECE DA IZMAPIRA FOREIGN KEY!!!
        return polozeniIspitiService.findAllBySid(polozeniIspiti);
    }
    
    
    @RequestMapping (method = RequestMethod.POST)
    public void save(@RequestBody PolozeniIspiti ispit){
        polozeniIspitiService.save(ispit);
    }
 
   
    @RequestMapping (value = "/{id}", method = RequestMethod.DELETE)
    public void delete (@PathVariable("id")int id ){
        polozeniIspitiService.delete(id);
    }
    
    
    
    
    
    
    
    
}

