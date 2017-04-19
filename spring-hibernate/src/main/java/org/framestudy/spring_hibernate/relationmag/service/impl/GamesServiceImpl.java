package org.framestudy.spring_hibernate.relationmag.service.impl;

import javax.annotation.Resource;

import org.framestudy.spring_hibernate.relationmag.beans.Games;
import org.framestudy.spring_hibernate.relationmag.dao.IGameDao;
import org.framestudy.spring_hibernate.relationmag.service.IGameService;
import org.springframework.stereotype.Service;

@Service
public class GamesServiceImpl implements IGameService {

	@Resource
	private IGameDao gameDaoImpl;
	
	
	@Override
	public void saveGameInfo(Games game) {
		// TODO Auto-generated method stub
		gameDaoImpl.saveGameInfo(game);
	}

	@Override
	public Games getGamesById(Long id) {
		// TODO Auto-generated method stub
		return gameDaoImpl.getGamesById(id);
	}

}
