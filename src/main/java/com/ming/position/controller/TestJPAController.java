package com.ming.position.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ming.position.domain.PositionsJPA;
import com.ming.position.domain.BasicJPA;
import com.ming.position.repository.PositionsJPARepository;
import com.ming.position.websocket.Greeting;
import com.ming.position.websocket.HelloMessage;
import com.ming.position.repository.BasicJPARepository;



@Controller
@RequestMapping("/")
public class TestJPAController {

	@Autowired
	private PositionsJPARepository testJPARepository;

	@Autowired
	private BasicJPARepository basicJPARepository;
	
	
	@RequestMapping("/positions")
	public @ResponseBody List<PositionsJPA> getPositionList(){
		return testJPARepository.findAll();
	}
	
	@RequestMapping("/basic")
	public @ResponseBody List<BasicJPA> getBasicList(){
		return basicJPARepository.findAll();
	}	
	
//	@RequestMapping
//	public @ResponseBody String index(){
//		return "TestJPA Connected..";
//	}
	
	@RequestMapping("/login")
	public String login(){
		return "login";
	}
	
	@RequestMapping("/websocket")
	public String websocket(){
		return "WebSocketTest";
	}
	
	
    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Greeting greeting(HelloMessage message) throws Exception {
        Thread.sleep(1000); // simulated delay
        return new Greeting("Hello, " + message.getName() + "!");
    }

	
}
