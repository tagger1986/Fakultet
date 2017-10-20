package com.in2.fakultet.prijavaispita;

import com.in2.fakultet.prijavaispita.Controller.StudentController;
import com.in2.fakultet.prijavaispita.Entity.Student;
import com.in2.fakultet.prijavaispita.Service.StudentService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.hamcrest.Matchers;
import static org.hamcrest.Matchers.is;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.mockito.BDDMockito.given;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;



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
        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
// //200 OK
//                .andExpect(jsonPath("$", Matchers.hasSize(1)))
//                .andExpect(jsonPath("$[0].name", is(s1.getName())));


        assertEquals(studenti, studentService.getAllStudents());
        assertEquals("Marija", s1.getName());
    }
    
    @Test
    public void saveTest() throws Exception {
        Student s1 = new Student(11, "Marija");
        given(studentService.save(s1)).willReturn(s1);

        mvc.perform(MockMvcRequestBuilders.post("/student/new")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().is(400));

        assertEquals(s1, studentService.save(s1));
    }
    
    @Test
    public void deleteTest() throws Exception {
        Student s1 = new Student(11, "Marija");
        Student s2 = new Student(5, "Petar");
        List<Student> studenti = new ArrayList<>();
        studenti.add(s1);
        studenti.add(s2);
        
//        given(studentService.delete(11)).isE);

        mvc.perform(MockMvcRequestBuilders.post("/student/{id}")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().is(400));

//        assertEquals(studenti.isEmpty(), studentService.delete(11));
    }


    
    
}
