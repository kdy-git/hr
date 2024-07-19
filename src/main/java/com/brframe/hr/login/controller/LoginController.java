package com.brframe.hr.login.controller;

import com.brframe.hr.login.dto.LoginDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/login")
public class LoginController {

    @PostMapping("")
    public ResponseEntity<Object> userLogin(@RequestBody LoginDto loginDTO) {

        return ResponseEntity.ok().body("test");
    }
}
