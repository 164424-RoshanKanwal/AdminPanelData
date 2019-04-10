package com.cfs.adminpaneldata.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cfs.adminpaneldata.models.AdminPanelAttributes;

@RestController
public class AdminPanelController {

	@Autowired
	private MongoTemplate mongoTemplate;
	
	@RequestMapping("/")
	public String addSurvey(@RequestBody AdminPanelAttributes adminPanelAttributes) {
		
		mongoTemplate.
		return null;
	}
	
	
}
