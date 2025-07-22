package com.pratham.deepseekai.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class OllamaService {

	private ChatClient chatClient;

	public OllamaService(OllamaChatModel chatModel) {
		this.chatClient = ChatClient.create(chatModel);
	}

	public ResponseEntity<String> getAnswer(String message) {
		try {
			ChatResponse chatResponse = chatClient.prompt(message).call().chatResponse();

			System.out.println("The LLM model we are using : " + chatResponse.getMetadata().getModel());

			String response = chatResponse.getResult().getOutput().getText();
			return new ResponseEntity<>(response, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>("No record found! Just ask easy question.", HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}
}
