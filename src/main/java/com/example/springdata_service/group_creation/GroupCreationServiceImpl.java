package com.example.springdata_service.group_creation;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.springdataDAO.group_creation.GroupCreationDAO;
import com.example.springdatapostgresql.GroupCreation;

public class GroupCreationServiceImpl implements GroupCreationService{
	
	@Autowired
	private GroupCreationDAO groupCreationDAO;

	@Override
	public List<GroupCreation> findAllGroup() {
		return groupCreationDAO.findAllGroup();
	}

	@Override
	public String createNewGroup(GroupCreation groupCreation) {
		groupCreation.setCreatedDate(LocalDateTime.now());
		groupCreation.setCreaterName("ravikart");
		groupCreation.setGroupCode("RAVI_1245789");
		groupCreation.setGroupId(1);
		groupCreation.setGroupName("Oct Sprint 3");
		groupCreation.setLastUpdatedDate(LocalDateTime.now());
		return String.valueOf(groupCreationDAO.createNewGroup(groupCreation));
	}

}
