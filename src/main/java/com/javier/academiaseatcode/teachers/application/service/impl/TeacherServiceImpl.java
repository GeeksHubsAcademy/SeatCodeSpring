package com.javier.academiaseatcode.teachers.application.service.impl;

import com.javier.academiaseatcode.teachers.application.service.ITeacherService;
import com.javier.academiaseatcode.teachers.domain.entities.Teacher;
import com.javier.academiaseatcode.teachers.infraestructure.persitence.dao.ITeacherDao;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class TeacherServiceImpl  implements ITeacherService {

    private static final org.apache.commons.logging.Log Logger = LogFactory.getLog("TeacherServiceImpl.class");

    @Autowired
    private ITeacherDao teacherDao;

    @Override
    public void saveTeacher(Teacher teacher) {
      teacherDao.save(teacher);
    }
}
