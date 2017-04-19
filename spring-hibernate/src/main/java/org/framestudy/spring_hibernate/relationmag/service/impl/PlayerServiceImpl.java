package org.framestudy.spring_hibernate.relationmag.service.impl;

import javax.annotation.Resource;

import org.framestudy.spring_hibernate.relationmag.beans.Player;
import org.framestudy.spring_hibernate.relationmag.dao.IPlayerDao;
import org.framestudy.spring_hibernate.relationmag.service.IPlayerService;
import org.springframework.stereotype.Service;

@Service
public class PlayerServiceImpl implements IPlayerService {

	@Resource
	private IPlayerDao playerDaoImpl;
	
	@Override
	public Player getPlayerById(Long id) {
		// TODO Auto-generated method stub
		return playerDaoImpl.getPlayerById(id);
	}

	@Override
	public void playerChooseGames(Player player) {
		// TODO Auto-generated method stub
		playerDaoImpl.playerChooseGames(player);
	}

}
