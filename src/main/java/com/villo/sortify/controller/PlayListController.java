package com.villo.sortify.controller;

import com.villo.sortify.dto.response.PlayListResponseDTO;
import com.villo.sortify.service.PlayListService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "playlist")
@RequiredArgsConstructor
public class PlayListController {
    private final PlayListService playListService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PlayListResponseDTO> getPlayListsFromLoggedUser(@RequestHeader("Authorization") final String auth) {
        return new ResponseEntity<>(this.playListService.getPlayListsFromLoggedUser(auth), HttpStatus.OK);
    }
}
