package com.example.board.service;

import org.springframework.http.ResponseEntity;

import com.example.board.dto.response.board.GetLatestListResponseDto;

import com.example.board.dto.request.PostBoardRequestDto;


public interface BoardService {

    ResponseEntity<? super GetLatestListResponseDto> getLatestList();

    ResponseEntity<String> postBoard( PostBoardRequestDto requestBody);
    
}
