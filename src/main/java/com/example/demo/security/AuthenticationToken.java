package com.example.demo.security;

import java.util.Collection;

import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;

public class AuthenticationToken extends AbstractAuthenticationToken {

	private static final long serialVersionUID = 1115940491146530429L;

	private final Object principal;
	private final Object credential;
	
	public AuthenticationToken(Object credential, Object principal, Collection<? extends GrantedAuthority> authorities) {
		super(null);
		this.credential = credential;
		this.principal = principal;
		super.setAuthenticated(true);
	}

	@Override
	public Object getCredentials() {
		return this.credential;
	}

	@Override
	public Object getPrincipal() {
		return this.principal;
	}
}
