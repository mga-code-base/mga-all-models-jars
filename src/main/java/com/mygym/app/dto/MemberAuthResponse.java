package com.mygym.app.dto;

public record MemberAuthResponse(boolean success, 
		String message, 
		String token, 
		String memberId, 
		String trainerId, 
		Boolean isActive, 
		Boolean isFacialRegCompleted) {}
