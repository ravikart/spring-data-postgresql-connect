package com.example.springdatapostgresql;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/home")
public class MainController {
	
	@Autowired
	public CodeCreationRepository repo;
	
	
	@PostMapping(path="/createGroup")
	public @ResponseBody String createGroup (@RequestParam String code
			, @RequestParam String createrName,@RequestParam String groupName) {
		GroupCreation groupCreation = new GroupCreation();
		//groupCreation.setCode(code);
		groupCreation.setCreaterName(createrName);
		groupCreation.setGroupName(groupName);
		groupCreation.setCreatedDate(LocalDateTime.now());
		groupCreation.setLastUpdatedDate(LocalDateTime.now());
		repo.save(groupCreation);
		return "Saved";
	}
	
	@GetMapping(path="/getAllGroup")
	public @ResponseBody Iterable<GroupCreation> getAllGroup(){
		return repo.findAll();
	}
	
	
	
	
	
}
