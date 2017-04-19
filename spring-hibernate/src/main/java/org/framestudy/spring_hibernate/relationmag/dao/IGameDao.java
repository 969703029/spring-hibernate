package org.framestudy.spring_hibernate.relationmag.dao;

import org.framestudy.spring_hibernate.relationmag.beans.Games;

public interface IGameDao {
	
	public void saveGameInfo(Games game);
	/**
	 * 根据ID查询游戏
	 * @param id
	 * @return
	 */
	public Games getGamesById(Long id);
}
