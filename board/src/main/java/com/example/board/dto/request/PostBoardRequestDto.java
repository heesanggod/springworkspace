package com.example.board.dto.request;

import com.example.board.dto.response.board.Item.BoardListItem;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PostBoardRequestDto {

    private String code;

    private String message;

    private BoardListItem[] latestList;

}
