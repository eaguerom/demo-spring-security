package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.MessageDto;

@RestController
@RequestMapping("demo")
public class DemoController {


	@GetMapping(value="one", produces = "application/json" )
	public ResponseEntity test() {
		return new ResponseEntity(new MessageDto("Hola Migue"), HttpStatus.OK);
	}
}
