
package com.in2.fakultet.prijavaispita.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 *
 * @author nosto
 */

@Controller
public class StudentController {
    
    @RequestMapping("/hello")
    public String zdr(){
        return "zdravo";
    }
    
    
}
