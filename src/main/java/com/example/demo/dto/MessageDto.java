package com.example.demo.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MessageDto implements Serializable {

	private static final long serialVersionUID = -3344673907525310668L;
	
	private String message;

}