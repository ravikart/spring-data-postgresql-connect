package com.example.springdatapostgresql;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GroupCreation{
	
	@EmbeddedId
	private GroupCreatePrimaryCode groupCreatePrimaryCode;
	
	@Column
	private String createrName;
	
	@Column
	private String groupName;
	
	public GroupCreatePrimaryCode groupCreatePrimaryCode() {
		return groupCreatePrimaryCode;
	}

	public void setGroupCreatePrimaryCode(GroupCreatePrimaryCode groupCreatePrimaryCode) {
		this.groupCreatePrimaryCode = groupCreatePrimaryCode;
	}

	public String getCreaterName() {
		return createrName;
	}

	public void setCreaterName(String createrName) {
		this.createrName = createrName;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public LocalDateTime getLastUpdatedDate() {
		return lastUpdatedDate;
	}

	public void setLastUpdatedDate(LocalDateTime lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}

	@Column
	private LocalDateTime createdDate;
	
	@Column
	private LocalDateTime lastUpdatedDate;
	
}

@Embeddable
class GroupCreatePrimaryCode implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5506613959088120732L;

	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long groupId;
	
	private String groupCode;

	public long getGroupId() {
		return groupId;
	}

	public void setGroupId(long groupId) {
		this.groupId = groupId;
	}

	public String getGroupCode() {
		return groupCode;
	}

	public void setGroupCode(String groupCode) {
		this.groupCode = groupCode;
	}
}
