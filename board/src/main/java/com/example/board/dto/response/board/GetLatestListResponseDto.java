package com.example.board.dto.response.board;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.example.board.dto.response.ResponseCode;
import com.example.board.dto.response.ResponseDto;
import com.example.board.dto.response.ResponseMessage;
import com.example.board.dto.response.board.Item.BoardListItem;

import lombok.Getter;

@Getter
public class GetLatestListResponseDto  extends ResponseDto{
    private List<BoardListItem> latestList;

    private GetLatestListResponseDto(List<BoardListItem> latestList) {
        super(ResponseCode.SUCCESS, ResponseMessage.SUCCESS);
        this. latestList = latestList;
    }

        // LatestList 여기만 쓰임
    public static ResponseEntity<GetLatestListResponseDto> success(List<BoardListItem> latesList) {
        GetLatestListResponseDto body = new GetLatestListResponseDto(latesList);
        return ResponseEntity.status(HttpStatus.OK).body(body);
    }

}
