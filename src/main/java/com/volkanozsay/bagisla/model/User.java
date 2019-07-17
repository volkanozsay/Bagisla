package com.volkanozsay.bagisla.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Set;

@Entity @Table(name = "USER") public class User {

	private Long userId;
	private String userName;
	private String password;
	private String userInfo;
	private Set<Donation> donations;
	private Role role;

}
