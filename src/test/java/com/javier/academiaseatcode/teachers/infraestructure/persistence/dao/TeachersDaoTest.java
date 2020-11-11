package com.javier.academiaseatcode.teachers.infraestructure.persistence.dao;

import com.javier.academiaseatcode.teachers.application.service.ITeacherService;
import com.javier.academiaseatcode.teachers.domain.entities.Teacher;
import com.javier.academiaseatcode.teachers.infraestructure.persitence.ITeacherDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class TeachersDaoTest {
    @Autowired
    private ITeacherService teacherService;

    @Test
    public void ShouldinjectedBean()
    {
        assertThat(teacherService).isNotNull();
    }

    @Test
    public void ShouldAddInBDTeacherWhenSave()
    {
        UUID uuid = UUID.randomUUID();
        Teacher teacher = new Teacher(
               "Xavi",
                "Rodriguez"
        );
       Teacher data =  teacherService.saveTeacher(teacher);
        assertThat(teacher.getUuid().toString()).isEqualTo(data.getUuid());



    }




}
