package com.javier.academiaseatcode.teachers.infraestructure.persitence.dao;

import com.javier.academiaseatcode.teachers.domain.entities.Teacher;

public interface ITeacherDao {
    void save(Teacher teacher);
}
