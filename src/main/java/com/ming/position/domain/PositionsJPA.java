package com.ming.position.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="positions")
public class PositionsJPA implements Serializable {

	private static final long serialVersionUID = 1L;
	
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="username")
	private String username;
	
	@Id
	@Column(name="time")
	private Date time; 
	
	@Column(nullable = true)
	private long x;
	
	@Column(nullable = true)
	private long y;
	
	@Column(nullable = true)
	private long AP_ID;
	
	@Column(nullable = true)
	private long NODE_ID;
	
	
	public String getUsername()
	{
		return username;
	}
	public long getX(){
		return x;
	}
	public long getY(){
		return y;
	}
	public long getAp_id(){
		return AP_ID;
	}
	public long getNode_id(){
		return NODE_ID;
	}
	public Date getTime(){
		return time;
	}
	
	public void setUsername(String username)
	{
		this.username = username;
	}
	public void setX(long x){
		this.x = x;
	}
	public void setY(long y){
		this.y = y;
	}
	public void setAp_id(long AP_ID){
		this.AP_ID = AP_ID;
	}
	public void setNode_id(long NODE_IP){
		this.NODE_ID = NODE_IP;
	}
	public void setDate(Date time){
		this.time = time;
	}

}
