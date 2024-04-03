package com.example.board.dto.response.auth;

import com.example.board.dto.response.ResponseDto;

import lombok.Getter;

@Getter
public class GetAuthResponseDto extends ResponseDto {
    private String email;
    private String nickname;
    private String telNumber;


    public GetAuthResponseDto(String code, String message) {
        super(code, message);
        
    }
    
}
