package com.pratham.deepseekai.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pratham.deepseekai.service.OpenAIService;

@RestController
@RequestMapping("/api/openai")
@CrossOrigin("*")

// We will be commenting OpenAI dependency from pom.xml file as it is mandatory to run the application, and as of now we don't have any API for that.
public class OpenAIController {

	@Autowired
	OpenAIService openAIService;

	@GetMapping("/{message}")
	public ResponseEntity<String> getAnswer(@PathVariable String message) {
		return openAIService.getAnswer(message);
	}
}
