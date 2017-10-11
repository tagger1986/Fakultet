package com.in2.fakultet.prijavaispita.Controller;

import com.in2.fakultet.prijavaispita.Entity.Predmet;
import com.in2.fakultet.prijavaispita.Service.PredmetService;
import java.util.Collection;
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
@RequestMapping("/predmet")
public class PredmetController {
    
    private PredmetService predmetService;

    @Autowired
    public PredmetController(PredmetService predmetService) {
        this.predmetService = predmetService;
    }
    
    @RequestMapping(method = RequestMethod.GET) 
    public Set<Predmet> getAllPredmeti() {
        return predmetService.getAllPredmeti();
    }
    
    @RequestMapping (value = "/{id}", method = RequestMethod.GET)
    public Predmet findById (@PathVariable("id")int id ){
        return predmetService.findById(id);
    }
    
    
    @RequestMapping (method = RequestMethod.POST)
    public void save(@RequestBody Predmet predmet){
        predmetService.save(predmet);
    }
 
   
    @RequestMapping (value = "/{id}", method = RequestMethod.DELETE)
    public void delete (@PathVariable("id")int id ){
        predmetService.delete(id);
    }
    
}