package org.codeforall.controllers;

import org.codeforall.model.Family;
import org.codeforall.services.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.print.DocFlavor;

@Controller
public class FamilyController {

    private Service service;

    @RequestMapping(method = RequestMethod.GET, path = { "/", ""})
    public String listFamily(Model model) {
        model.addAttribute("family", service.listFamily());
        return "index";
    }

    /*@RequestMapping(method = RequestMethod.GET, path = {"/{id}"})
    public String getFamily(@PathVariable Integer id, Model model){
        Service serviceId = service.getId();
        model.addAttribute("")
    }*/

    @Autowired
    public void setService(Service service) {
        this.service = service;
    }
}
