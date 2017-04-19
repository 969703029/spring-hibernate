package org.framestudy.spring_hibernate.relationmag.service;

import org.framestudy.spring_hibernate.relationmag.beans.Player;

public interface IPlayerService {
	/**
	 * 根据ID查询玩家
	 * @param id
	 * @return
	 */
	public Player getPlayerById(Long id);
	/**
	 * 玩家选择游戏
	 * @param player
	 */
	public void playerChooseGames(Player player);
}
