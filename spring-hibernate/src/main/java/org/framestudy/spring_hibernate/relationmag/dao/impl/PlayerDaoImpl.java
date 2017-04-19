package org.framestudy.spring_hibernate.relationmag.dao.impl;

import org.framestudy.spring_hibernate.relationmag.beans.Player;
import org.framestudy.spring_hibernate.relationmag.dao.IPlayerDao;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

@Repository
public class PlayerDaoImpl implements IPlayerDao {

	
	private Session session;
	
	public void setSession(Session session) {
		this.session = session;
	}
	
	@Override
	public Player getPlayerById(Long id) {
		// TODO Auto-generated method stub
		return (Player) session.get(Player.class, id);
	}

	@Override
	public void playerChooseGames(Player player) {
		// TODO Auto-generated method stub
		session.saveOrUpdate(player);		
	}
}
