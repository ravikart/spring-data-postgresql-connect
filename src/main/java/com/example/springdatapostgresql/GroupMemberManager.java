package com.example.springdatapostgresql;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class GroupMemberManager {
	
	@Column
	public long groupId;
	
	@Id
	public String userName;
	
	@Column
	public boolean activePerson;
	
	public long getGroupId() {
		return groupId;
	}

	public void setGroupId(long groupId) {
		this.groupId = groupId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public boolean isActivePerson() {
		return activePerson;
	}

	public void setActivePerson(boolean activePerson) {
		this.activePerson = activePerson;
	}

	public LocalDateTime getAddedDate() {
		return addedDate;
	}

	public void setAddedDate(LocalDateTime addedDate) {
		this.addedDate = addedDate;
	}

	@Column
	public LocalDateTime addedDate;
	
	
}
