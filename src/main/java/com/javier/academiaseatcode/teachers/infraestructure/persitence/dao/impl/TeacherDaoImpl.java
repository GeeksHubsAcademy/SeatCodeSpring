package com.javier.academiaseatcode.teachers.infraestructure.persitence.dao.impl;

import com.javier.academiaseatcode.teachers.domain.entities.Teacher;
import com.javier.academiaseatcode.teachers.infraestructure.persitence.dao.ITeacherDao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class TeacherDaoImpl implements ITeacherDao {

   @PersistenceContext
   private EntityManager entityManager;

    @Override
    public void save(Teacher teacher) {
        entityManager.persist(teacher);
    }
}
