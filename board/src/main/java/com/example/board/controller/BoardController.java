package com.example.board.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.board.dto.request.PostBoardRequestDto;
import com.example.board.dto.response.board.GetLatestListResponseDto;
import com.example.board.service.BoardService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/board")
@RequiredArgsConstructor
public class BoardController {
    
    private final BoardService boardService;

    @GetMapping("/latest-list")
    public ResponseEntity<GetLatestListResponseDto> getLatestList () {
        return null;
    }

    @PostMapping
    public ResponseEntity<String> postBoard (
        @RequestBody @Valid PostBoardRequestDto requestBody
    ) {
        ResponseEntity<String> response = boardService.postBoard(requestBody);
        return response;
    }
}
