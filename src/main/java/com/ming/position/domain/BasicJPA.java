package com.ming.position.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="basic")
public class BasicJPA implements Serializable {

	private static final long serialVersionUID = 2L;
	
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	@Column(name="username")
	private String username;
	
	@Column(name="password")
	private String password;

	public String getUsername()
	{
		return username;
	}
	
	public void setUsername(String username)
	{
		this.username = username;
	}
	
	public String getPassword()
	{
		return username;
	}
	
	public void setPassword(String username)
	{
		this.username = username;
	}

	
	
}
