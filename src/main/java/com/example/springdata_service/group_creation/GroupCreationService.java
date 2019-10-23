package com.example.springdata_service.group_creation;

import java.util.List;

import com.example.springdatapostgresql.GroupCreation;

public interface GroupCreationService {

	public List<GroupCreation> findAllGroup();
	
	public String createNewGroup(GroupCreation groupCreation);
}
