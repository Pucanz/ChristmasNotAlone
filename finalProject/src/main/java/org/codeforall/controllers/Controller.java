package org.codeforall.controllers;

import org.codeforall.model.Family;
import org.codeforall.services.Service;

import java.util.List;

public class Controller {


    private Service service;
    public void start(){
        System.out.println("Starting controller");
        List<Family> family = service.listFamily();
        System.out.println("Fetched family list, there are " + family.size() + " family members.");
        for(Family list: family){
            System.out.println(list.toString());
        }
    }

    public void testFamily(){
        Family abilios = new Family("Abilio","abilio@gmail.com","923245564","2345-534","piriquito","McDonalds","BOUAS, venham passar o natal com nos", true);
        service.addFamily(abilios);
    }

    public void setService(Service service) {
        this.service = service;
    }
}
