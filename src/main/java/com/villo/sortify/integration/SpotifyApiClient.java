package com.villo.sortify.integration;

import com.villo.sortify.sto.response.PlayListResponseSTO;
import com.villo.sortify.sto.response.UserInfoResponseSTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "spotify", url = "https://api.spotify.com/v1/")
public interface SpotifyApiClient {
    @GetMapping(value = "/me")
    UserInfoResponseSTO getInfoFromLoggedUser(@RequestHeader("Authorization") final String auth);

    @GetMapping(value = "users/{userId}/playlists", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    PlayListResponseSTO getPlayListsFromLoggedUser(@RequestHeader("Authorization") final String auth, @PathVariable("userId") final String userId);
}
