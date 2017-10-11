
package com.in2.fakultet.prijavaispita.Controller;

import com.in2.fakultet.prijavaispita.Entity.PolozeniIspiti;
import com.in2.fakultet.prijavaispita.Entity.Student;
import com.in2.fakultet.prijavaispita.Service.PolozeniIspitiService;
import com.in2.fakultet.prijavaispita.Service.StudentService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author nosto
 */

@RestController
@RequestMapping("/report")
public class PolozeniIspitiController{
    
    private PolozeniIspitiService polozeniIspitiService;

    
   //ovo polje ima ref ka objektu koji implementira taj interface kad okinemo bilo koji kontroler
    

    @Autowired  //spring boot kreira i inject u controller
    public PolozeniIspitiController(PolozeniIspitiService polozeniIspitiService) {
        this.polozeniIspitiService = polozeniIspitiService;
    }
    
    
    @RequestMapping(value = "/izv",method = RequestMethod.GET) 
    public Set<PolozeniIspiti>getAllPolozeniIspiti() {
        return polozeniIspitiService.getAllPolozeniIspiti();
    }
        

    @RequestMapping (value = "izv/{id}", method = RequestMethod.GET)
    public PolozeniIspiti findById (@PathVariable("id")int id ){
        return polozeniIspitiService.findById(id);
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

