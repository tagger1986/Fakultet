package com.in2.fakultet.prijavaispita;

import com.in2.fakultet.prijavaispita.Controller.ReportController;
import com.in2.fakultet.prijavaispita.Controller.StudentController;
import com.in2.fakultet.prijavaispita.Entity.PolozeniIspiti;
import com.in2.fakultet.prijavaispita.Entity.Student;
import com.in2.fakultet.prijavaispita.Repository.StudentRepository;
import com.in2.fakultet.prijavaispita.Service.PolozeniIspitiService;
import com.in2.fakultet.prijavaispita.Service.PolozeniIspitiServiceImp;
import com.in2.fakultet.prijavaispita.Service.StudentService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.mockito.BDDMockito.given;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(ReportController.class)
public class TestPolozeniIspiti {
    
    @Autowired
    MockMvc mvc;
    
    @MockBean
    private PolozeniIspitiService polozeniIspitiService;
//    @Mock
//    PolozeniIspiti polozeniIspiti;
//    @Mock
//    Student student;
// 
//    @InjectMocks
//    PolozeniIspitiServiceImp polozeniIspitiRepository;
//    StudentRepository studentRepository;
           
    
//    @Before
//    public void setup() {
//        initMocks(this);
//        
//    }

//    @Test
//    public void calculateAvgTest() {
//
//        PolozeniIspiti p1 = new PolozeniIspiti(11, new Student(22, "Marija"), 7);
//        PolozeniIspiti p2 = new PolozeniIspiti(12, new Student(22, "Marija"), 8);
//        
//        List<PolozeniIspiti> polozeni = new ArrayList<>();
//        polozeni.add(p1);
//        polozeni.add(p2);
//
//        when(polozeniIspitiRepository.calculateAvg(22)).thenReturn("Prosecna ocena studenta 1 je 7.5");
//        assertEquals("Prosecna ocena studenta 22 je 7.5", polozeniIspitiRepository.calculateAvg(22));
//        
//    }
//    
    
    @Test
    public void saveTest() throws Exception {
        PolozeniIspiti p1 = new PolozeniIspiti(11, new Student(22, "Marija"), 2222);

//       
        given(polozeniIspitiService.save(p1)).willReturn(p1);

        mvc.perform(MockMvcRequestBuilders.post("/report")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().is(400));
//                .equals(p1.getGrade()>4);
//                .andExpect(p1.getGrade()>4);

        assertEquals(p1, polozeniIspitiService.save(p1));
    }

}
