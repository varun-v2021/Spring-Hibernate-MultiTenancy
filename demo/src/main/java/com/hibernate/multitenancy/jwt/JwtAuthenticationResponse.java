package com.hibernate.multitenancy.jwt;

import java.io.Serializable;

import org.springframework.security.core.userdetails.UserDetails;

public class JwtAuthenticationResponse implements Serializable {
	private static final long serialVersionUID = 1250166508152483573L;

	private final String token;
	private final UserDetails user;

	public JwtAuthenticationResponse(String token, UserDetails user) {
		this.token = token;
		this.user = user;
	}
}
