package com.javier.academiaseatcode.teachers.infraestructure.persitence.impl;

import com.javier.academiaseatcode.teachers.domain.entities.Teacher;
import com.javier.academiaseatcode.teachers.infraestructure.persitence.ITeacherDao;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Transactional
@Service
public class TeacherDaoImpl implements ITeacherDao {

   @PersistenceContext
   private EntityManager entityManager;

    @Override
    public void save(Teacher teacher) {


        entityManager.persist(teacher




        );
    }
}
