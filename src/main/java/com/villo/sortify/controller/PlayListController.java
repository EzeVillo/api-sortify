package com.villo.sortify.controller;

import com.villo.sortify.dto.response.PlayListResponseDTO;
import com.villo.sortify.dto.response.TrackPlayListResponseDTO;
import com.villo.sortify.service.PlayListService;
import jakarta.websocket.server.PathParam;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "playlist")
@RequiredArgsConstructor
public class PlayListController {
    private final PlayListService playListService;

    @GetMapping
    public ResponseEntity<PlayListResponseDTO> getPlayListsFromLoggedUser(@RequestHeader("Authorization") final String auth) {
        return new ResponseEntity<>(this.playListService.getPlayListsFromLoggedUser(auth), HttpStatus.OK);
    }

    @GetMapping(value = "{playListId}/track")
    public ResponseEntity<TrackPlayListResponseDTO> getTracksFromPlayList(
            @RequestHeader("Authorization") final String auth, @PathVariable final String playListId) {
        return new ResponseEntity<>(this.playListService.getTracksFromPlayList(auth, playListId), HttpStatus.OK);
    }

    @PutMapping(value = "{playListId}/sort")
    public ResponseEntity<Void> sortTracksFromPlayList(
            @RequestHeader("Authorization") final String auth, @PathVariable final String playListId, @RequestParam(required = false) final String orderBy) {
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
