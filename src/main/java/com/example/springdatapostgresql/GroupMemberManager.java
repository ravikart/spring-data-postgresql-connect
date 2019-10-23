package com.example.springdatapostgresql;

import java.time.LocalDateTime;

import lombok.Data;


@Data
public class GroupMemberManager {

	public long groupId;

	public String userName;

	public boolean activePerson;

	public LocalDateTime addedDate;

}
