
package com.in2.fakultet.prijavaispita.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author nosto
 */

@RestController
public class StudentController {
    
    @RequestMapping("/hello")
    public String zdr(){
        return "zdravo";
    }
    
    
}
