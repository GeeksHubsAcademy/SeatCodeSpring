package com.javier.academiaseatcode.common.application.service.impl;

import com.javier.academiaseatcode.common.application.service.IDniService;
import org.springframework.stereotype.Service;

import java.util.regex.Pattern;

@Service
public class DniServiceImpl implements IDniService {

    @Override
    public Boolean checkDni(String dni) {
        String dniRegexp= "\\d{8}[A-J-NP-TV-Z]";
        return Pattern.matches(dniRegexp, dni);
    }
}
