package com.example.springdatapostgresql;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class GroupCreation {

	private long groupId;

	private String groupCode;

	private String createrName;

	private String groupName;

	private LocalDateTime createdDate;

	private LocalDateTime lastUpdatedDate;
	
}