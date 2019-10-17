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
	
	@Autowired
	public CodeCreation codeCreation;
	
	@PostMapping(path="/add")
	public @ResponseBody String addNewUser (@RequestParam String code
			, @RequestParam String createrName,@RequestParam String groupName) {		
		codeCreation.setCode(code);
		codeCreation.setCreaterName(createrName);
		codeCreation.setGroupName(groupName);
		codeCreation.setCreatedDate(LocalDateTime.now());
		codeCreation.setLastUpdatedDate(LocalDateTime.now());
		repo.save(codeCreation);
		return "Saved";
	}
	
	@GetMapping(path="/getAll")
	public @ResponseBody Iterable<CodeCreation> getAllData(){
		return repo.findAll();
	}
}
