package com.example.springdatapostgresql;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.springdata_service.group_creation.GroupCreationService;

@Controller
@RequestMapping("/home")
public class MainController {
	
	@Autowired
	public GroupCreationService groupCreation;
	
	
	@PostMapping(path="/createGroup",consumes = {"application/json"})
	public @ResponseBody String createGroup (@RequestBody GroupCreation groupCreationData) {
		System.out.println(groupCreationData.getCreaterName());
		System.out.println(groupCreationData.getGroupCode());
		System.out.println(groupCreationData.getGroupId());
		System.out.println(groupCreationData.getGroupName());
		System.out.println(groupCreationData.getCreatedDate());
		System.out.println(groupCreationData.getLastUpdatedDate());
		return groupCreation.createNewGroup(groupCreationData);
	}
	
	@GetMapping(path="/getAllGroup")
	public @ResponseBody List<GroupCreation> getAllGroup(){
		return groupCreation.findAllGroup();
	}
	
	
	
	
	
}
