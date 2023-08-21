package com.villo.sortify.integration;

import com.villo.sortify.sto.response.UserInfoResponseSTO;
import feign.Headers;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "spotify", url = "https://api.spotify.com/v1/")
public interface SpotifyApiClient {
    @GetMapping(value = "/me")
    public UserInfoResponseSTO getInfoFromLoggedUser(@RequestHeader("Authorization") final String auth);
}
