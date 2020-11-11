package com.javier.academiaseatcode.teachers.infraestructure.persitence;

import com.javier.academiaseatcode.teachers.domain.entities.Teacher;

public interface ITeacherDao {
    void save(Teacher teacher);
}
