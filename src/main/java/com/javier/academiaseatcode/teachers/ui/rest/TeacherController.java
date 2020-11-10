package com.javier.academiaseatcode.teachers.ui.rest;


import org.apache.commons.logging.LogFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("teachers")
public class TeacherController {

    private static final org.apache.commons.logging.Log Logger = LogFactory.getLog("TeacherController.class");

    @RequestMapping(value="", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Void> home(){
        Logger.info("Iniciado home ----------");
        return new ResponseEntity("Es una prueba", HttpStatus.OK);
    }


}
