package com.teamsearcher.dao;

import com.teamsearcher.model.Game;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class GameDao {

    @Autowired
    private SessionFactory sessionFactory;

    protected Session getSession(){
        return sessionFactory.getCurrentSession();
    }

    public List<Game> allGames(){
        return (List<Game>) getSession().createQuery("From Game").list();
    }

    public void saveOrUpdate(Game game){
        getSession().saveOrUpdate(game);
    }
}
