package com.example.demo.security;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

@Component
public class AuthenticationTokenProvider implements AuthenticationProvider {

	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {

		System.out.println("AuthenticationTokenProvider::authenticate");	
		
		return null;
	}

	@Override
	public boolean supports(Class<?> authentication) {
		System.out.println("AuthenticationTokenProvider::supports");	
		return false;
	}

}
