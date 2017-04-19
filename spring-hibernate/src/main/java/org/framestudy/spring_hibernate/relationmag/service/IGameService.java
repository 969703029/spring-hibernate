package org.framestudy.spring_hibernate.relationmag.service;

import org.framestudy.spring_hibernate.relationmag.beans.Games;

public interface IGameService {

	public void saveGameInfo(Games game);
	/**
	 * 根据ID查询游戏
	 * @param id
	 * @return
	 */
	public Games getGamesById(Long id);
}
