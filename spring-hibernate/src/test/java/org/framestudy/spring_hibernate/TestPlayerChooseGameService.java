package org.framestudy.spring_hibernate;

import javax.annotation.Resource;

import org.framestudy.spring_hibernate.relationmag.beans.Games;
import org.framestudy.spring_hibernate.relationmag.beans.Player;
import org.framestudy.spring_hibernate.relationmag.service.IGameService;
import org.framestudy.spring_hibernate.relationmag.service.IPlayerService;
import org.framestudy.spring_hibernate.utils.SessionUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:applicationContext.xml"})
public class TestPlayerChooseGameService {

	@Resource
	private IGameService gamesServiceImpl;
	@Resource
	private IPlayerService playerServiceImpl;
	
	
	
	
	
	
	@Test
	public void playerChooseGames(){
		
		Session session = SessionUtils.getSession();
		Transaction tx = session.beginTransaction();
		
		try {
			Player player = (Player) session.get(Player.class, 3l);
//			Games game = (Games) session.get(Games.class, 2l);
//			Games game1 = (Games) session.get(Games.class, 1l);
			Games game2 = (Games) session.get(Games.class, 3l);
			player.getGames().add(game2);
			
			session.saveOrUpdate(player);
			
			tx.commit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			tx.rollback();
		}finally {
			session.close();
		}
	}
	
	@Ignore
	public void testGetPlayerById(){
		Player player = playerServiceImpl.getPlayerById(3l);
		Assert.assertNotNull(player);
		
		System.out.println(player.getName());
		System.out.println(player.getGames());
		
	}
	
	@Ignore
	public void testGetGamesById(){
		Games game = gamesServiceImpl.getGamesById(3L);
		Assert.assertNotNull(game);
		
		System.out.println(game.getPlayers());
	}
	
	
	
	
	@Ignore
	public void saveGameInfo(){
		
		Games game = new Games(null, "LOL", null);
		
		gamesServiceImpl.saveGameInfo(game);
		
		
	}
	
	
	
	
}
