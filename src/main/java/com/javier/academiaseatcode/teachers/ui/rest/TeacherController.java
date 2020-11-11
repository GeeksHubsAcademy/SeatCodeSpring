package com.javier.academiaseatcode.teachers.ui.rest;


import com.javier.academiaseatcode.teachers.domain.entities.Teacher;
import com.javier.academiaseatcode.teachers.infraestructure.persitence.dao.ITeacherDao;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("teachers")
public class TeacherController {

    private static final org.apache.commons.logging.Log Logger = LogFactory.getLog("TeacherController.class");

    @Autowired
    private ITeacherDao teacherDao;

    @RequestMapping(value="", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Void> home(){
        Logger.info("Iniciado home ----------");
        return new ResponseEntity("Es una prueba", HttpStatus.OK);
    }


    @RequestMapping(value="", method=RequestMethod.POST, produces="application/json")
   public ResponseEntity<Teacher> saveTeacher(@RequestBody Teacher teacher, UriComponentsBuilder builder)
   {
       Logger.debug("Recived object --->"+ teacher);
       teacherDao.save(teacher);
       return new ResponseEntity(teacher, HttpStatus.OK);
   }

}
