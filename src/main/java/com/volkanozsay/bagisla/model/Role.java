package com.volkanozsay.bagisla.model;

import javax.persistence.*;
import java.util.Set;

@Entity @Table(name = "ROLE") public class Role {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "ROLE_ID") private Long roleId;
	@Column(name = "ROLE_NAME") private String roleName;
	@ManyToMany(mappedBy = "roles") private Set<User> userSet;

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Set<User> getUserSet() {
		return userSet;
	}

	public void setUserSet(Set<User> userSet) {
		this.userSet = userSet;
	}
}
