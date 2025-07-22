package com.pratham.deepseekai.service;

//import org.springframework.ai.anthropic.AnthropicChatModel;
//import org.springframework.ai.chat.client.ChatClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AnthropicService {
	// We can do implement the Anthropic as same as OpenAI but using ChatClient we
	// get more options( More customizable)
	// private ChatClient chatClient;

	// We can only use chat client is by using AnthropicChatModel
	// public AnthropicService(AnthropicChatModel chatModel) {
	// this.chatClient = ChatClient.create(chatModel);
	// }

	public ResponseEntity<String> getAnswer(String message) {
		try {
			// String response = chatClient.prompt(message).call().content();
			// Replace "Needs bucks to run the Anthropic show!" from below line with
			// response when Anthropic API Key is available(Application.properties).
			return new ResponseEntity<>("Needs money to buy the Anthropic API Key!", HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>("No record found! Just ask easy question.", HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}
}
