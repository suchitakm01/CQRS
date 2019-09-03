package com.techm.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class User implements Serializable{
	@Id
	@GeneratedValue
	Long id;
	private String username;
    private String email;
    private boolean isEnabled;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isEnabled() {
		return isEnabled;
	}
	public void setEnabled(boolean isEnabled) {
		this.isEnabled = isEnabled;
	}
	
	@Override
	public String toString() {
		return "User [username=" + username + ", email=" + email + ", isEnabled=" + isEnabled + "]";
	}
}
