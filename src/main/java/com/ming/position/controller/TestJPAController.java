package com.ming.position.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ming.position.domain.TestJPA;
import com.ming.position.repository.TestJPARepository;


@Controller
@RequestMapping("/")
public class TestJPAController {

	@Autowired
	private TestJPARepository testJPARepository;
	
	@RequestMapping("/positions")
	public @ResponseBody List<TestJPA> getPositionList(){
		return testJPARepository.findAll();
	}
	
	@RequestMapping
	public @ResponseBody String index(){
		return "TestJPA Connected..";
	}
	
}
