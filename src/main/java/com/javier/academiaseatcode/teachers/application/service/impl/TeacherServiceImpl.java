package com.javier.academiaseatcode.teachers.application.service.impl;

import com.javier.academiaseatcode.teachers.application.service.ITeacherService;
import com.javier.academiaseatcode.teachers.domain.entities.Teacher;
import com.javier.academiaseatcode.teachers.domain.repository.ITeacherRepository;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl  implements ITeacherService {

    private static final org.apache.commons.logging.Log Logger = LogFactory.getLog("TeacherServiceImpl.class");

    @Autowired
    private ITeacherRepository teacherRepository;

    @Override
    public Teacher saveTeacher(Teacher teacher) {
       return teacherRepository.save(teacher);
    }
}
