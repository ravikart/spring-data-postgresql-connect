package com.example.springdataDAO.group_creation;

import java.util.List;

import com.example.springdatapostgresql.GroupCreation;

public interface GroupCreationDAO {

	public List<GroupCreation> findAllGroup();

	public int createNewGroup(GroupCreation groupCreation);
}
