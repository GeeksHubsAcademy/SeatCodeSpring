package com.javier.academiaseatcode.teachers.ui.rest;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.javier.academiaseatcode.AcademiaseatcodeApplication;
import com.javier.academiaseatcode.teachers.domain.entities.Teacher;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = AcademiaseatcodeApplication.class)
@AutoConfigureMockMvc
public class TeacherControllerTest {

    @Autowired
    private MockMvc mvc;


    @Autowired
    private WebApplicationContext context;


    @Before("")
    public void setup(){
        mvc = MockMvcBuilders
                .webAppContextSetup(context)
                .build();
    }


    @Test
    public void ShouldReturnOkWhenVisitTeachers() throws  Exception{
        mvc.perform(get("/teachers").contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk());
    }

    @Test
    public void ShouldSameNameToCreateTeacher() throws Exception {
        Teacher teacher = new Teacher("Prueba", "Prueba");
        mvc.perform(post("/teachers")
                .contentType(MediaType.APPLICATION_JSON)
                .content(this.toJson(teacher)))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name").value(teacher.getName()));
    }


    static byte[] toJson(Object object ) throws  Exception
    {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").create();
        return gson.toJson(object).getBytes();
    }

}
