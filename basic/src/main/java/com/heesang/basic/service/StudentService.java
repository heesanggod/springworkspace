package com.heesang.basic.service;

import org.springframework.http.ResponseEntity;

import com.heesang.basic.dto.request.student.PatchStudentRequestDto;
import com.heesang.basic.dto.request.student.PostStudentRequestDto;

public interface StudentService {
    ResponseEntity<String> postStudent(PostStudentRequestDto dto);
    ResponseEntity<String> patchStudent(PatchStudentRequestDto dto);
}
