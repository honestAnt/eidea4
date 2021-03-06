package com.dsdl.eidea.base.entity.po;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * SysUserRole entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "sys_user_role", catalog = "e_idea")
@Getter
@Setter
public class UserRolePo implements java.io.Serializable {

	// Fields
	@Id
	@Column(name = "id", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "sys_user_id", nullable = false)
	private UserPo sysUser;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "sys_role_id", nullable = false)
	private RolePo sysRole;
}