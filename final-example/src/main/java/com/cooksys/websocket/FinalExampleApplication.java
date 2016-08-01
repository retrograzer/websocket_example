package com.cooksys.websocket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

import com.cooksys.websocket.component.NumberHandler;

@SpringBootApplication
@EnableWebSocket
@EnableScheduling
public class FinalExampleApplication implements WebSocketConfigurer {

	@Autowired
	NumberHandler numberHandler;
	
	public static void main(String[] args) {
		SpringApplication.run(FinalExampleApplication.class, args);
	}

	@Override
	public void registerWebSocketHandlers(WebSocketHandlerRegistry handlerRegistry) {
		handlerRegistry.addHandler(numberHandler, "/number");
	}
}
