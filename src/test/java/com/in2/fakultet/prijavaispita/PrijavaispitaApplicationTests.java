package com.in2.fakultet.prijavaispita;

import com.in2.fakultet.prijavaispita.Repository.PolozeniIspitiRepository;
import java.util.Collections;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@RunWith(SpringRunner.class)
@SpringBootTest
@WebMvcTest
public class PrijavaispitaApplicationTests {
        
    
    @Autowired
    MockMvc mockMvc;
    @MockBean
    PolozeniIspitiRepository polozeniIspitiRepository;

    @Test
    public void contextLoads() throws Exception {

        when(polozeniIspitiRepository.findAll()).thenReturn(Collections.emptyList());

        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/report/izv")
                .accept(MediaType.APPLICATION_JSON)
        ).andReturn();

        System.out.println(mvcResult.getResponse());

        Mockito.verify(polozeniIspitiRepository).findAll();

    }

        

}
