package org.codeforall.services;

import com.sun.org.apache.bcel.internal.generic.FADD;
import org.codeforall.daos.Dao;
import org.codeforall.model.Family;

import javax.transaction.Transactional;
import java.util.List;

public class Service {

    private Dao dao;

    //public Integer getFamilyId(){ return dao.findById();}
    @Transactional
    public List<Family> listFamily(){ return dao.read();}
    @Transactional
    public void addFamily(Family family){ dao.create(family);}

    public void setDao(Dao dao) {
        this.dao = dao;
    }
}
