package com.example.springdata_mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.springdatapostgresql.GroupCreation;

public class GroupCreationMapper implements RowMapper<GroupCreation>{

	@Override
	public GroupCreation mapRow(ResultSet resultSet, int rowNum) throws SQLException {
		GroupCreation groupData = new GroupCreation();
		groupData.setGroupId(resultSet.getLong("group_id"));
		groupData.setGroupName(resultSet.getString("group_name"));
		groupData.setGroupCode(resultSet.getString("group_code"));
		groupData.setCreaterName(resultSet.getString("creater_name"));
		return groupData;
	}

}
