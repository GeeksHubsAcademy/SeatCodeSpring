package com.javier.academiaseatcode.teachers.domain.repository;

import com.javier.academiaseatcode.teachers.domain.entities.Teacher;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITeacherRepository extends CrudRepository<Teacher, String> {
}
