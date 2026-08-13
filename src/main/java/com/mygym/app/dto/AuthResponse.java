package com.mygym.app.dto;

public record AuthResponse(boolean isActive, String message, String token, String role, String personId, String branchId) {}
