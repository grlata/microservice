package com.eazybytes.accounts.dto;

import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

public class ErrorResponseDto {
    private String apiPath;
    private String errorMessage;
    private HttpStatus errorCode;
    private LocalDateTime errorTime;

}
