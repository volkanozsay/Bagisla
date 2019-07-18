package com.volkanozsay.bagisla.model;

import javax.persistence.*;
import java.util.Set;

@Entity @Table(name = "USER") public class User {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "USER_ID") private Long userId;
	@Column(name = "USER_EMAIL",length = 100) private String userEmail;
	@Column(name = "USER_NAME",length = 100) private String userName;
	@Column(name = "PASSWORD",length = 100) private String password;
	@Column(name = "USER_INFO",length = 100) private String userInfo;
	@Column(name = "USER_TC",length = 11) private String userTC;
	@Column(name = "USER_IMAGE") @Lob private Byte[] userImage;
	@OneToMany(mappedBy = "user") private Set<Donation> donations;
	@ManyToMany @Column(name = "ROLE_ID") private Set<Role> roles;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
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

	public String getUserTC() {
		return userTC;
	}

	public void setUserTC(String userTC) {
		this.userTC = userTC;
	}

	public Byte[] getUserImage() {
		return userImage;
	}

	public void setUserImage(Byte[] userImage) {
		this.userImage = userImage;
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
