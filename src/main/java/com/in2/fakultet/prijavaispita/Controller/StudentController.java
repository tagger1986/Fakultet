package com.in2.fakultet.prijavaispita.Controller;

import com.in2.fakultet.prijavaispita.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.in2.fakultet.prijavaispita.Service.StudentService;
import java.util.List;
import org.springframework.stereotype.Controller;



@Controller
@RequestMapping("/student")
public class StudentController {
    
    private StudentService studentService;
    
    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    
    @RequestMapping(method = RequestMethod.GET) 
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }
    
    @RequestMapping (value = "/modified/{lastUpdatedBy}", method = RequestMethod.GET)
    public List<Student> findAllByLastUpdatedBy (@PathVariable("lastUpdatedBy")int id ){
        return studentService.findAllByLastUpdatedBy(id);
    }
    @RequestMapping (value = "/{studentId}", method = RequestMethod.GET)
    public List<Student> findAllByStudentId (@PathVariable("studentId")int id ){
        return studentService.findAllByStudentId(id);
    }
    
    @RequestMapping (method = RequestMethod.POST)
    public void save(@RequestBody Student student){
        studentService.save(student);
    }
 
   
    @RequestMapping (value = "/{id}", method = RequestMethod.DELETE)
    public void delete (@PathVariable("id")int id ){
        studentService.delete(id);
    }
    
}