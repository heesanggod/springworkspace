package com.example.board.entity.pk;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class FavoritePk implements Serializable {
    @Column (name = "board_number")
    private Integer boardNumber;
    @Column (name = "user_number")
    private String userEmail;
    
}
