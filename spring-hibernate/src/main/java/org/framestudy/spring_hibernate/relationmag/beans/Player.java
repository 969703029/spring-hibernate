package org.framestudy.spring_hibernate.relationmag.beans;

import java.io.Serializable;
import java.util.Set;

public class Player implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6477418490925254937L;
	
	private Long id;
	
	private String name;
	
	private Set<Games> games;

	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Player(Long id, String name, Set<Games> games) {
		super();
		this.id = id;
		this.name = name;
		this.games = games;
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

	public Set<Games> getGames() {
		return games;
	}

	public void setGames(Set<Games> games) {
		this.games = games;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", games=" + games + "]";
	}
}
