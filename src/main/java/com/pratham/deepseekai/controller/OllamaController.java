package com.pratham.deepseekai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pratham.deepseekai.service.OllamaService;

@RestController
@RequestMapping("/api/ollama")
@CrossOrigin("*")
public class OllamaController {

	@Autowired
	OllamaService ollamaService;
	
	@GetMapping("/{message}")
	public ResponseEntity<String> getAnswer(@PathVariable String message){
		return ollamaService.getAnswer(message);
	}
}
