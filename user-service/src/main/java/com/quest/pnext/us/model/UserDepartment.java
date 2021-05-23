package com.quest.pnext.us.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserDepartment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userDepartmentId;
	
	@Column
	private String departmentName;

	public Long getUserDepartmentId() {
		return userDepartmentId;
	}

	public void setUserDepartmentId(Long userDepartmentId) {
		this.userDepartmentId = userDepartmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UserDepartment [userDepartmentId=");
		builder.append(userDepartmentId);
		builder.append(", departmentName=");
		builder.append(departmentName);
		builder.append("]");
		return builder.toString();
	}

}
