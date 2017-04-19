package org.framestudy.spring_hibernate.relationmag.dao.impl;

import org.framestudy.spring_hibernate.relationmag.beans.Games;
import org.framestudy.spring_hibernate.relationmag.dao.IGameDao;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

@Repository
public class GameDaoImpl implements IGameDao {

	private Session session;
	
	public void setSession(Session session) {
		this.session = session;
	}
	
	@Override
	public void saveGameInfo(Games game) {
		// TODO Auto-generated method stub
		session.save(game);
	}

	@Override
	public Games getGamesById(Long id) {
		// TODO Auto-generated method stub
		return (Games) session.get(Games.class, id);
	}

}
