package com.teamsearcher.service;

import com.teamsearcher.dao.FormDao;
import com.teamsearcher.dao.GameDao;
import com.teamsearcher.model.Form;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class FormService {
    private FormDao formDao;

    @Autowired
    public void setFormDao(FormDao formDao) {
        this.formDao = formDao;
    }

    public List<Form> allForms(){
        return formDao.allForms();
    }

    public void saveOrUpdate(Form form){
        formDao.saveOrUpdate(form);
    }
}
