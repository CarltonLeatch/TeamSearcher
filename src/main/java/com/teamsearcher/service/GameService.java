package com.teamsearcher.service;

import com.teamsearcher.dao.GameDao;
import com.teamsearcher.model.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class GameService {

    private GameDao gameDao;

    @Autowired
    public void setGameDao(GameDao gameDao){
        this.gameDao = gameDao;
    }

    public List<Game> allGames() {
        return gameDao.allGames();
    }

    public void saveOrUpdate(Game game) {
        gameDao.saveOrUpdate(game);
    }
}
