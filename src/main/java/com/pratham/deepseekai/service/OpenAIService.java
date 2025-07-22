package com.pratham.deepseekai.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
//import org.springframework.ai.openai.OpenAiChatModel;
//import org.springframework.beans.factory.annotation.Autowired;

@Service
public class OpenAIService {
	// @Autowired
//			private OpenAiChatModel chatModel;

	public ResponseEntity<String> getAnswer(String message) {
		try {
			// String response = chatModel.call(message);
			// Replace "Needs bucks to run the OpenAI show!" from below line with response
			// when OpenAI API Key is available(Application.properties).

			return new ResponseEntity<>("Needs money to buy the OpenAI API Key!", HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();

			return new ResponseEntity<>("No record found! Just ask easy question.", HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}
}
