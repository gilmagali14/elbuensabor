package com.utn.jpa1.controller;

import com.utn.jpa1.entities.DomicilioEntity;
import com.utn.jpa1.services.DomicilioServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/domicilios")
public class DomicilioController extends BaseControllerImpl<DomicilioEntity, DomicilioServiceImpl> {
}
