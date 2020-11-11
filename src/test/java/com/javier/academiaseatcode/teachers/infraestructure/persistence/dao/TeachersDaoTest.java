package com.javier.academiaseatcode.teachers.infraestructure.persistence.dao;

import com.javier.academiaseatcode.teachers.domain.entities.Teacher;
import com.javier.academiaseatcode.teachers.infraestructure.persitence.dao.ITeacherDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class TeachersDaoTest {
    @Autowired
    private ITeacherDao teacherDao;

    @Test
    public void ShouldinjectedBean()
    {
        assertThat(teacherDao).isNotNull();
    }

    @Test
    public void ShouldAddInBDTeacherWhenSave()
    {
        UUID uuid = UUID.randomUUID();
        Teacher teacher = new Teacher(
                uuid,
                "Xavi",
                "Rodriguez",
                new Date()
        );
        teacherDao.save(teacher);
        assertThat(teacher.getUuid().toString()).isEqualTo(uuid.toString());



    }




}
