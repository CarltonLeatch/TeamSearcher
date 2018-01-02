package com.teamsearcher.dao;

import com.teamsearcher.model.Form;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FormDao {

    @Autowired
    private SessionFactory sessionFactory;

    protected Session getSession(){
        return sessionFactory.getCurrentSession();
    }

    public List<Form> allForms(){
        return getSession().createQuery("From Form").list();
    }

    public void saveOrUpdate(Form form){
        getSession().saveOrUpdate(form);
    }
}
