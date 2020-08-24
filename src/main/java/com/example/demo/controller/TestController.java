package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.MessageDto;

@RestController
@RequestMapping("test")
public class TestController {

	@GetMapping(value="one", produces = "application/json" )
	public ResponseEntity test() {

		System.out.print("testing...");
		return new ResponseEntity(new MessageDto("testing..."), HttpStatus.OK);
	}
}
