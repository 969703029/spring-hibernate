package org.framestudy.spring_hibernate.relationmag.beans;

import java.io.Serializable;
import java.util.Set;

public class Games implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3949567704488516403L;

	private Long id;
	
	private String name;//游戏名称
	
	private Set<Player> players;

	public Games() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Games(Long id, String name, Set<Player> players) {
		super();
		this.id = id;
		this.name = name;
		this.players = players;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Player> getPlayers() {
		return players;
	}

	public void setPlayers(Set<Player> players) {
		this.players = players;
	}

	@Override
	public String toString() {
		return "Games [id=" + id + ", name=" + name + "]";
	}
	
	
	
}
