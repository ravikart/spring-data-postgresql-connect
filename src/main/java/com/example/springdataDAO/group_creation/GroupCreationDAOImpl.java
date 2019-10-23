package com.example.springdataDAO.group_creation;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.example.springdata_mapper.GroupCreationMapper;
import com.example.springdatapostgresql.GroupCreation;

public class GroupCreationDAOImpl implements GroupCreationDAO{

	private JdbcTemplate jdbcTemplate;
	
	private static String GET_ALL_GROUP = "Select * from group_creation";
	
	private static String INSERT_GROUP = "insert into group_creation(group_code,group_id,"
			+ "creater_name,created_date,group_name,last_updated_date) values (?,?,?,?,?,?)";
	
	private static String MAX_GROUP_ID = "select max(group_id) from group_creation";
	
	public GroupCreationDAOImpl(JdbcTemplate jdbcTemplate){
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<GroupCreation> findAllGroup() {
		return jdbcTemplate.query(GET_ALL_GROUP, new GroupCreationMapper());
	}

	@Override
	public int createNewGroup(GroupCreation groupCreation) {
		return jdbcTemplate.update(INSERT_GROUP, groupCreation.getGroupCode(),groupCreation.getGroupId(),
				groupCreation.getCreaterName(),groupCreation.getCreatedDate(),groupCreation.getGroupName()
				,groupCreation.getLastUpdatedDate());
	}
}
