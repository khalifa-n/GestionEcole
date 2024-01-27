package com.ecole221.gestionecole.controller;

import com.ecole221.gestionecole.model.Eleve;
import com.ecole221.gestionecole.service.EleveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EleveController {
    @Autowired
private EleveService eleveService;
    public ResponseEntity<List<Eleve>> getAll(){
        List<Eleve> eleves = eleveService.getAll();
      return   new ResponseEntity<>(eleves, HttpStatus.OK);
    }
}
