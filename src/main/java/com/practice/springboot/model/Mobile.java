package com.practice.springboot.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Mobile {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String mobileName;
	private Integer mobileCost;
	@ManyToOne(cascade=CascadeType.ALL)
	private User user;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMobileName() {
		return mobileName;
	}
	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}
	public Integer getMobileCost() {
		return mobileCost;
	}
	public void setMobileCost(Integer mobileCost) {
		this.mobileCost = mobileCost;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Mobile [id=" + id + ", mobileName=" + mobileName + ", mobileCost=" + mobileCost + ", user=" + user
				+ "]";
	}

	

}
