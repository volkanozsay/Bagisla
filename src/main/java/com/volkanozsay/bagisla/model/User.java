package com.volkanozsay.bagisla.model;

import javax.persistence.*;
import java.util.Set;

@Entity @Table(name = "USER") public class User {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "USER_ID") private Long userId;
	@Column(name = "USER_NAME") private String userName;
	@Column(name = "PASSWORD") private String password;
	@Column(name = "USER_INFO") private String userInfo;
	@OneToMany(mappedBy="user") private Set<Donation> donations;
	@ManyToMany @Column(name = "ROLE_ID") private Set<Role> roles;

	//TODO Kullanıcı resmi, TC Kimlik alanlarını ekle

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(String userInfo) {
		this.userInfo = userInfo;
	}

	public Set<Donation> getDonations() {
		return donations;
	}

	public void setDonations(Set<Donation> donations) {
		this.donations = donations;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
}
