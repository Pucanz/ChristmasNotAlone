package org.codeforall.controllers;

import org.codeforall.model.Family;
import org.codeforall.services.FamilyService;

import java.util.List;

public class Controller {


    private FamilyService service;
    public void start(){
        System.out.println("Starting controller");
        List<Family> family = service.listFamily();
        System.out.println("Fetched family list, there are " + family.size() + " family members.");
        for(Family list: family){
            System.out.println(list.toString());
        }
    }

  /*  public void testFamily(){
        Family abilios = new Family("Abilio","abilio@gmail.com","923245564","2345-534","piriquito","McDonalds","BOUAS, venham passar o natal com nos", true);
        service.addFamily(abilios);
    }
   */

    public void addFamily(Family family){
        service.addFamily(family);
    }

    public void setService(FamilyService service) {
        this.service = service;
    }
}
