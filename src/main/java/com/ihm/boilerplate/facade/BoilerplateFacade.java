package com.ihm.boilerplate.facade;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoilerplateFacade {

    @RequestMapping(value = "/boilerplate", method = RequestMethod.GET)
    public String boilerplate() {
        return "BoilerplateFacade.boilerplate(): Hello World";
    }

}
