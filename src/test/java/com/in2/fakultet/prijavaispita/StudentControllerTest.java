package com.in2.fakultet.prijavaispita;

import com.in2.fakultet.prijavaispita.Controller.StudentController;
import com.in2.fakultet.prijavaispita.Entity.Student;
import com.in2.fakultet.prijavaispita.Service.StudentService;
import java.util.Arrays;
import java.util.List;
import org.hamcrest.Matchers;
import static org.hamcrest.Matchers.is;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.mockito.BDDMockito.given;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;



@RunWith(SpringRunner.class)
@WebMvcTest(StudentController.class)
public class StudentControllerTest {
        
    
    @Autowired
    MockMvc mvc;
    @MockBean
    private StudentService studentService;

    @Test
    public void giveAllStudentsTest() throws Exception {
        
        Student s1 = new Student(11, "Marija");
        
        List<Student> studenti = Arrays.asList(s1);
        
        given(studentService.getAllStudents()).willReturn(studenti);
        
        mvc.perform(MockMvcRequestBuilders.get("/student")
        .contentType(MediaType.APPLICATION_JSON));
//                .andExpect(status().isOk())
// //200 OK
//                .andExpect(jsonPath("$", Matchers.hasSize(1)))
//                .andExpect(jsonPath("$[0].name", is(s1.getName())));


        assertEquals(studenti, studentService.getAllStudents());
    }
}
