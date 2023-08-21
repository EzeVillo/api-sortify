package com.villo.sortify.controller;

import com.villo.sortify.dto.response.UserInfoResponseDTO;
import com.villo.sortify.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping(value = "/me")
    public UserInfoResponseDTO getInfoFromLoggedUser(@RequestHeader("Authorization") final String auth) {
        return this.userService.getInfoFromLoggedUser(auth);
    }
}
