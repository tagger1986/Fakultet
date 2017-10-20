package com.in2.fakultet.prijavaispita;

import com.in2.fakultet.prijavaispita.Controller.ReportController;
import com.in2.fakultet.prijavaispita.Controller.StudentController;
import com.in2.fakultet.prijavaispita.Entity.PolozeniIspiti;
import com.in2.fakultet.prijavaispita.Entity.Student;
import com.in2.fakultet.prijavaispita.Repository.PolozeniIspitiRepository;
import com.in2.fakultet.prijavaispita.Service.PolozeniIspitiService;
import com.in2.fakultet.prijavaispita.Service.StudentService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static jdk.nashorn.internal.objects.NativeString.substring;
import org.hamcrest.Matchers;
import static org.hamcrest.Matchers.is;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.mockito.BDDMockito.given;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
//
//@RunWith(SpringRunner.class)
//@WebMvcTest(ReportController.class)
//public class TestCalculateAvg {
//
//    @Autowired
//    private MockMvc mvc;
//    @Autowired
//    @Mock
//    private PolozeniIspitiService polozeniIspitiService;
//    
//    @Before
//    public void setup(){
//       polozeniIspitiService
//    }
//    @Test
//    public void calculatorAvgTest() throws Exception {
//        Mockito.when(polozeniIspitiService.calculateAvg(1)).thenReturn("Prosecna ocena studenta 1 je 7.2");
//        assertEquals("Prosecna ocena studenta 1 je 7.2", polozeniIspiti.inc());
//        
//    }
//        
//        PolozeniIspiti p1 = new PolozeniIspiti(11, new Student(22, "Marija"), 7);
//        PolozeniIspiti p2 = new PolozeniIspiti(12, new Student(22, "Marija"), 8);
//        String value = "Prosecna ocena studenta 1 je 7.5";
//
//        List<PolozeniIspiti> polozeni = new ArrayList<>();
//        polozeni.add(p1);
//        polozeni.add(p2);
//        when(polozeniIspitiService.calculateAvg(22)).thenReturn(value);
//
//        mvc.perform(MockMvcRequestBuilders.get("average/{studentId}")
//                .contentType(MediaType.APPLICATION_JSON));
////              .andExpect((ResultMatcher) content().string(Matchers.containsString("Prosecna ocena studenta 1 je 7.2")));
//
//        assertEquals(value, polozeniIspitiService.calculateAvg(22));
//
//    }
//}
@RunWith(SpringRunner.class)
@DataJpaTest
public class TestCalculateAvg {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private PolozeniIspitiService polozeniIspitiService;

    @Test
    public void testCalculateAvg() throws Exception {
        
        this.entityManager.persist(new PolozeniIspiti(1, new Student(1, "Marija"), 7));
        
        String prosecnaOcena = this.polozeniIspitiService.calculateAvg(1);
        
        assertEquals(prosecnaOcena,polozeniIspitiService.calculateAvg(1));
   
    }

}